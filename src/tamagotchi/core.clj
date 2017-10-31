(ns tamagotchi.core)

(defn born []
  {:hungriness 50 :fullness 50})

(defn feed [tamagotchi]
  (-> tamagotchi
      (update :hungriness dec)
      (update :fullness inc)))
