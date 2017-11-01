(ns tamagotchi.core)

(def default-hungriness 50)
(def default-fullness 50)
(def default-happiness 50)

(defn born
  ([]
   (born
     default-hungriness
     default-fullness
     default-happiness))
  ([hungriness fullness happiness]
   (assoc
     {}
     :hungriness hungriness
     :fullness fullness
     :happiness happiness)))

(defn feed [tamagotchi]
  (-> tamagotchi
      (update :hungriness dec)
      (update :fullness inc)))

(defn play [tamagotchi]
  (-> tamagotchi
      (update :happiness inc)))
