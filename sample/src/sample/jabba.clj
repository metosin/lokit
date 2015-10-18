(ns sample.jabba
  (:require [clojure.tools.logging :as log]))

(defn logit! []
  (log/debug "jabba debug")
  (log/info  "jabba info"))
