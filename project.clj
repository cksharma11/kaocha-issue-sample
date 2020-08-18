(defproject kaocha-issue-sample "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :profiles {:kaocha {:dependencies [[lambdaisland/kaocha "1.0.641"]]}
             :dev {:dependencies [[mock-clj "0.2.0"]]}}
  :aliases {"kaocha" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner"]}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :repl-options {:init-ns kaocha-issue-sample.core})
