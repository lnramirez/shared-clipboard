(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src/cljs"
    {:main 'shared-clipboard.core
     :output-to "resources/public/js/shared_clipboard.js"
     :output-dir "resources/public/js/out"
     :asset-path "js/out"
     :verbose true})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))
