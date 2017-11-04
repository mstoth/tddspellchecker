(ns spell-checker.core-test
  (:require [clojure.test :refer :all]
            [spell-checker.core :refer :all]))

(deftest words-exist
  (testing "words exists"
    (is (> 0 (count words)))))

(run-tests)