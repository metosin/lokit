(ns lokit.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [clojure.tools.logging :as log]
            [lokit.configurator :as conf]))

(deftest foo-test
  (conf/logback-autoconfig!)
  (log/infof "Hello world"))
