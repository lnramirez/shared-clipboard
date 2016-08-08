(ns bajoneando.routes
  (:use compojure.core)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [ring.middleware.keyword-params :refer [wrap-keyword-params]]
            [ring.util.response :as response]))

(defroutes app-routes
  (GET "/" [] (response/resource-response "about.html" {:root "public"}))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> app-routes
      wrap-keyword-params))
