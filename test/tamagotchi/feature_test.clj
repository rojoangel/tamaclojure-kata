(ns tamagotchi.feature-test
  (:require [clojure.test :refer :all]
            [spexec.core :refer :all]
            [tamagotchi.feature-steps :refer :all]))

;; run feature
(exec-spec "resources/tamagotchi.feature")
