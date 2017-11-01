(ns tamagotchi.feature-steps
  (:require [clojure.test :refer :all]
            [spexec.core :refer :all]
            [tamagotchi.core :refer :all]))

(def initial-hungriness 50)

(defgiven #"I have a Tamagotchi"
          [_]
          (born))

(defwhen #"I feed it"
         [tamagotchi]
         (feed tamagotchi))

(defthen #"its hungriness is decreased"
         [tamagotchi]
         (do
           (is (= (dec default-hungriness) (:hungriness tamagotchi)))
           tamagotchi))

(defwhen #"its fullness is increased"
         [tamagotchi]
         (do
           (is (= (inc default-fullness) (:fullness tamagotchi)))
           tamagotchi))
