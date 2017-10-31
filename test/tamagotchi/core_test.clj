(ns tamagotchi.core-test
  (:require [clojure.test :refer :all]
            [tamagotchi.core :refer :all]
            [spexec.core :refer :all]))

(defn born []
  {})

(defn feed [tamagotchi]
  tamagotchi)

(defgiven #"I have a Tamagotchi"
          [_]
          (born))

(defwhen #"I feed it"
         [tamagotchi]
         (feed tamagotchi))

;; run specs
(exec-spec "resources/tamagotchi.feature")
