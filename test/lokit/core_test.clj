(ns lokit.core-test
  (:require [clojure.test :as test :refer [deftest is testing]]
            [clojure.tools.logging :as log]
            [lokit.configurator :as conf]))

(conf/logback-autoconfig!)
(conf/set-level! 'sample.jabba :debug)
(conf/set-level! 'sample.abba :info)
(conf/set-level! 'lokit.core-test :info)
