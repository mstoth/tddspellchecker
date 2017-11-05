(ns spell-checker.core-test
  (:require [clojure.test :refer :all]
            [spell-checker.core :refer :all]))

(deftest words-exist
  (testing "words exists"
    (is (> (count words) 0))))

(run-tests)