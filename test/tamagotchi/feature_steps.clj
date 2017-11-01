(ns tamagotchi.feature-steps
  (:require [clojure.test :refer :all]
            [spexec.core :refer :all]
            [tamagotchi.core :as tamagotchi]))

(defgiven #"I have a Tamagotchi"
          [_]
          (tamagotchi/born))

(defwhen #"I feed it"
         [tamagotchi]
         (tamagotchi/feed tamagotchi))

(defwhen #"I play with it"
         [tamagotchi]
         (tamagotchi/play tamagotchi))

(defwhen #"I put it to bed"
         [tamagotchi]
         (tamagotchi/put-to-bed tamagotchi))

(defwhen #"I make it poop"
         [tamagotchi]
         (tamagotchi/poo tamagotchi))

(defwhen #"time passes"
         [tamagotchi]
         (tamagotchi/tic tamagotchi))

(defthen #"its hungriness is decreased"
         [tamagotchi]
         (do
           (is (= (dec tamagotchi/default-hungriness)
                  (:hungriness tamagotchi)))
           tamagotchi))

(defthen #"its fullness is increased"
         [tamagotchi]
         (do
           (is (= (inc tamagotchi/default-fullness)
                  (:fullness tamagotchi)))
           tamagotchi))

(defthen #"its happiness is increased"
         [tamagotchi]
         (do
           (is (= (inc tamagotchi/default-happiness)
                  (:happiness tamagotchi)))
           tamagotchi))

(defthen #"its tiredness is increased"
         [tamagotchi]
         (do
           (is (= (inc tamagotchi/default-tiredness)
                  (:tiredness tamagotchi)))
           tamagotchi))

(defthen #"its tiredness is decreased"
         [tamagotchi]
         (do
           (is (= (dec tamagotchi/default-tiredness)
                  (:tiredness tamagotchi)))
           tamagotchi))

(defthen #"its fullness is decreased"
         [tamagotchi]
         (do
           (is (= (dec tamagotchi/default-fullness)
                  (:fullness tamagotchi)))
           tamagotchi))
