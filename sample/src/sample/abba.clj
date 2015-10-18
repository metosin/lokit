(ns sample.abba
  (:require [clojure.tools.logging :as log]))

(defn logit! []
  (log/debug "abba debug")
  (log/info  "abba info"))
