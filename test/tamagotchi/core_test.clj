(ns tamagotchi.core-test
  (:require [clojure.test :refer :all]
            [tamagotchi.core :refer :all]
            [spexec.core :refer :all]))

(defn born []
  {})

(defgiven #"I have a Tamagotchi"
          [_]
          (born))

;; run specs
(exec-spec "resources/tamagotchi.feature")
