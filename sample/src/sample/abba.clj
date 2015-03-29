(ns sample.abba
  (:require [clojure.tools.logging :refer :all]))

(defn logit! []
  (debug "abba debug")
  (info  "abba info"))
