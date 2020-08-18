(ns ^:foo kaocha-issue-sample.core-test2
  (:require [clojure.test :refer :all]
            [kaocha-issue-sample.core :refer :all]
            [mock-clj.core :as mc]))

(deftest test-bar
  (testing "foo with mock"
    (mc/with-mock [foo "oof"]
      (is (= (bar "test") "oofbar"))
      (is (= (mc/calls foo) [["test"]]))
      (is (= (mc/last-call foo) ["test"]))
      (is (= 1 (mc/call-count foo)))
      (is (mc/called? foo)))))

(deftest mock-private-test
  (mc/with-mock [#'kaocha-issue-sample.core/g "baz"]
    (is (= (#'kaocha-issue-sample.core/f "foo") "baz"))))