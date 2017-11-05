(ns spell-checker.core-test
  (:require [clojure.test :refer :all]
            [spell-checker.core :refer :all]))

(deftest words-exist
  (testing "words exists"
    (is (> (count words) 0))))
(deftest words-is-a-set
  (testing "words is a set"
           (is (= (type #{1 2 3}) (type words)))))

(run-tests)