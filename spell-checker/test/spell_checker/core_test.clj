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
(deftest main-works
  (testing "main- should also work"
           (is (= (with-out-str (-main "a")) "correct!\n"))))
(deftest distance-works
  (testing "the function distance should return 0" 
           (is (= (distance "a" "a") 0))))

(deftest min-distance-test
  (testing "a partial distance function should work for spelling and spilling"
           (is (= (min-distance "spellling") "spelling"))))

(deftest apply-test
  (testing "using apply with min-distance on words" 
           (is (= (min-distance "about") "about"))))

(deftest main-with-words
  (testing "using -main will work with words and return suggestions"
           (is (= (with-out-str (-main "spelling")) "correct!\n"))
                      (is (= (with-out-str (-main "spellling")) "did you mean spelling?\n"))))

(run-tests)