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
