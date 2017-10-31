(ns tamagotchi.core-test
  (:require [clojure.test :refer :all]
            [tamagotchi.core :refer :all]
            [spexec.core :refer :all]))

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

(defwhen #"its fullness is increased"
         [tamagotchi]
         (do
           (is (= 51 (:fullness tamagotchi)))
           tamagotchi))

;; run specs
(exec-spec "resources/tamagotchi.feature")
