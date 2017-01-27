(ns lokit.configurator
  (:import [ch.qos.logback.classic Level Logger LoggerContext]
           [ch.qos.logback.classic.util ContextInitializer]
           [org.slf4j LoggerFactory]
           [lokit.configurator.impl Configurator]))

(defn logback-autoconfig! []
  (let [logger (LoggerFactory/getLogger Logger/ROOT_LOGGER_NAME)
        logger-ctx (.getLoggerContext logger)]
    (doto (ContextInitializer. logger-ctx)
      (.autoConfig))))

(defn set-level! [logger-name level]
  (doto (LoggerFactory/getLogger (name logger-name))
    (.setLevel (Level/valueOf (name level)))))
