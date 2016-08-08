(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'shared-clipboard.core
   :output-to "out/shared_clipboard.js"
   :output-dir "out"})
