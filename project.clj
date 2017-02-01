(defproject clj-sampler "0.1.0-SNAPSHOT"
  :description "This is a data sampling library in Clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [incanter "1.5.7"]]
  :main ^:skip-aot clj-sampler.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
