(ns spell-checker.core
  (:gen-class)
  (:require [clojure.string :as str])
  (:import (org.apache.commons.lang3 StringUtils)))

(def words (set (map str/trim (str/split-lines (slurp "resources/wordsEn.txt")))))
(defn correct? [w] (if (contains? words w) (println "correct!") (println "did you mean xy?")))
(defn distance [x y] (StringUtils/getLevenshteinDistance x y))
(defn min-distance [w] (min-key (partial distance w) "spelling" "spilling"))
(defn -main
  "I print out 'correct!' if w is in words"
  [& args]
  (correct? (first  args)))
