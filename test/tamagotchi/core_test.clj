(ns tamagotchi.core-test
  (:require [clojure.test :refer :all]
            [tamagotchi.core :refer :all]
            [spexec.core :refer :all]))

(defn born []
  {:hungriness 50})

(defn feed [tamagotchi]
  (update tamagotchi :hungriness dec))

(defgiven #"I have a Tamagotchi"
          [_]
          (born))

(defwhen #"I feed it"
         [tamagotchi]
         (feed tamagotchi))

(defthen #"its hungriness is decreased"
         [tamagotchi]
         (do
           (is (= 49 (:hungriness tamagotchi)))
           tamagotchi))

;; run specs
(exec-spec "resources/tamagotchi.feature")
