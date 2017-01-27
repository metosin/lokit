(ns lokit.configurator.impl
  (:import [ch.qos.logback.classic PatternLayout Logger LoggerContext]
           [ch.qos.logback.classic.spi ILoggingEvent]
           [ch.qos.logback.core ConsoleAppender]
           [ch.qos.logback.core.encoder LayoutWrappingEncoder]
           [java.nio.charset Charset])
  (:gen-class :name lokit.configurator.impl.Configurator
              :state state
              :init init
              :prefix "-"
              :extends ch.qos.logback.core.spi.ContextAwareBase
              :implements [ch.qos.logback.classic.spi.Configurator]
              :methods []))

(defn -init []
  [[] (atom nil)])

(defn -configure [this ^LoggerContext lc]
  (.addInfo this "Initializing Lokit dynamic log configurator.")

  ;; fixme: template params?
  (let [appender (doto (ConsoleAppender.)
                   (.setContext lc)
                   (.setName "console"))

        encoder (doto (LayoutWrappingEncoder.)
                  (.setCharset (Charset/forName "UTF-8"))
                  (.setContext lc))

        layout (doto (PatternLayout.)
                 (.setPattern "%d{YYYY-MM-dd HH:mm:ss.SSS Z} [%thread] %-5level [%logger{36}] - %msg%n%rEx")
                 (.setContext lc)
                 (.start))]

    (.setLayout encoder layout)

    (.setEncoder appender encoder)
    (.start appender)

    (doto (.getLogger lc Logger/ROOT_LOGGER_NAME)
      (.detachAndStopAllAppenders)
      (.addAppender appender))))

