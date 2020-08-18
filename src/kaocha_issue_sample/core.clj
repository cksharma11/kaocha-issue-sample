(ns kaocha-issue-sample.core)

(defn foo [a] (str "foo" a))

(defn bar [a] (str (foo a) "bar"))

(defn- g [] true)
(defn f [a] (g))

