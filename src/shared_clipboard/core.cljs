(ns shared-clipboard.core
  (:require [clojure.browser.repl :as repl]
            [cljsjs.auth0-lock]
            [goog.dom :as dom]))

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(def auth-lock (js/Auth0Lock. "ZwRL3GzqTroxa2edgpXXhU8vFbZrUzxN" "lnramirez.auth0.com" (js-obj) ))

(.on auth-lock "authenticated" (fn [auth-result]
                                 (.getProfile auth-lock (.-idToken auth-result) (fn [an-error profile]
                                                                                  (if an-error
                                                                                    (println (str "Something wrong" an-error))
                                                                                    (println (.stringify js/JSON profile)))))))

(.addEventListener (dom/getElement "btn-login") "click" (fn [e] (do
                                                                  (.preventDefault e)
                                                                  (.show auth-lock))))

(println "Hello world!")
