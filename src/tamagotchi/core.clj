(ns tamagotchi.core)

(def default-hungriness 50)
(def default-fullness 50)

(defn born
  ([]
   (born
     default-hungriness
     default-fullness))
  ([hungriness fullness]
   (assoc
     {}
     :hungriness hungriness
     :fullness fullness)))

(defn feed [tamagotchi]
  (-> tamagotchi
      (update :hungriness dec)
      (update :fullness inc)))
