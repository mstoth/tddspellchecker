(ns spell-checker.core-test
  (:require [clojure.test :refer :all]
            [spell-checker.core :refer :all]))

(deftest words-exist
  (testing "words exists"
    (is (> (count words) 0))))
(deftest words-is-a-set
  (testing "words is a set"
           (is (= (type #{1 2 3}) (type words)))))
(deftest correct?-exists
  (testing "we have a function called 'correct?'" 
           (is (function? correct?))))
(deftest correct?-works
  (testing "correct? works for one known word"
           (is (= (with-out-str (correct? "a")) "correct!\n"))))

(run-tests)