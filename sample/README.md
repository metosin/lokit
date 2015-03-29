# Sample

Sample project using Lokit.

## Usage

* `resources/lokit.xml` defines the logging levels (reusing the lokit's `logback.xml`):

```xml
<included>
  <logger name="sample.jabba" level="DEBUG"/>
  <logger name="sample.abba" level="INFO"/>
</included>
```

* alternatively one could override the whole log config by creating `resources/logback.xml`

```
$ lein repl

(require '[sample.jabba :as jabba])
(require '[sample.abba :as abba])

(abba/logit!)
;; only INFO is logged

(jabba/logit!)
;; both DEBUG and INFO are logged
```

## License

Copyright © 2015 [Metosin Oy](http://www.metosin.fi)

Distributed under the Eclipse Public License, the same as Clojure.