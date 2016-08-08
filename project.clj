(defproject shared-clipboard "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.89"]
                 [cljsjs/auth0-lock "9.2.1-0"]
                 [compojure "1.5.1"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :plugins [[lein-npm "0.6.1"]
            [lein-ring "0.9.7"]]
  :npm {:dependencies [[source-map-support "0.4.0"]]}
  :ring {:handler bajoneando.routes/app}
  :source-paths ["src/clj" "target/classes"]
  :clean-targets ["out" "release"]
  :target-path "target")
