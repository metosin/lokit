(ns sample.jabba
  (:require [clojure.tools.logging :refer :all]))

(defn logit! []
  (debug "jabba debug")
  (info  "jabba info"))
