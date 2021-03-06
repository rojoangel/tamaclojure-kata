(ns tamagotchi.core)

(def default-hungriness 50)
(def default-fullness 50)
(def default-happiness 50)
(def default-tiredness 50)

(defn born
  ([]
   (born
     default-hungriness
     default-fullness
     default-happiness
     default-tiredness))
  ([hungriness fullness happiness tiredness]
   (assoc
     {}
     :hungriness hungriness
     :fullness fullness
     :happiness happiness
     :tiredness tiredness)))

(defn feed [tamagotchi]
  (-> tamagotchi
      (update :hungriness dec)
      (update :fullness inc)))

(defn play [tamagotchi]
  (-> tamagotchi
      (update :happiness inc)
      (update :tiredness inc)))

(defn put-to-bed [tamagotchi]
  (-> tamagotchi
      (update :tiredness dec)))

(defn poo [tamagotchi]
  (-> tamagotchi
      (update :fullness dec)))

(defn tic [tamagotchi]
  (-> tamagotchi
      (update :hungriness inc)
      (update :happiness dec)))
