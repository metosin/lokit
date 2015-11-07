(defproject metosin/lokit "0.1.0"
  :description "Single dependency for logging on the JVM."
  :url "https://github.com/metosin/lokit"
  :license {:name         "Eclipse Public License"
            :url          "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments     "same as Clojure"}
  :dependencies [[org.clojure/tools.logging "0.3.1"]
                 [org.slf4j/jcl-over-slf4j "1.7.12"]
                 [org.slf4j/jul-to-slf4j "1.7.12"]
                 [org.slf4j/log4j-over-slf4j "1.7.12"]
                 [ch.qos.logback/logback-classic "1.1.3" :exclusions [org.slf4j/slf4j-api]]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.7.0"]]}})
