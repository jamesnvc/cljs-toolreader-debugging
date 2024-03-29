(defproject debugging "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [org.clojure/tools.reader "0.8.4"]
                 [org.clojure/clojurescript "0.0-2202"]]

  :source-paths ["src/clj"]
  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-ring "0.8.10"]]
  :ring {:handler debugging.core/app}
  :cljsbuild {:builds
              [{:source-paths ["src/cljs"]
                :compiler {:output-dir "resources/public/js"
                           :output-to "resources/public/js/debugging.js"
                           :optimizations :none
                           :source-maps true}}]}
  )
