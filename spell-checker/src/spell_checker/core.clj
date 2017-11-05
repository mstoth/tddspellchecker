(ns spell-checker.core
  (:gen-class)
  (:require [clojure.string :as str]))

(def words (set (map str/trim (str/split-lines (slurp "resources/wordsEn.txt")))))
(defn correct? [w] (if (contains? words w) (println "correct!") (println "did you mean xy?")))
(defn -main
  "I print out 'correct!' if w is in words"
  [& args]
  (correct? (first  args)))
