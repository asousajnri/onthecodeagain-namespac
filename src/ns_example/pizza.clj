(ns ns-example.pizza
  "This namespace is all about the PIZZA!"
  {:author "Pizza Man"}
  (:refer-clojure :exclude [count]))

*ns*
(all-ns)

(meta (the-ns 'ns-example.pizza))
(meta (find-ns 'ns-example.pizza))

(def count "There are 100 pizzas")

count

(def pizza-rating-map
  {::margerita "margerita keyword"
   ::mexicana "mexicana"})

(comment
  (meta 'pizza-rating-map)
  (pizza-rating-map ::margerita))

(defn get-pizza-slice [] "pizza")

(defn get-rating [pizza-type]
  (println "pizza-type" pizza-type)
  (println "pizza-rating-map pizza-type" (pizza-rating-map pizza-type))
  (get pizza-rating-map pizza-type "Pizza not yet rated"))

(comment
 ::margerita
 pizza-rating-map
 (get-pizza-slice)
 (get-rating ::margerita)
 (get-rating ::doesnt-pizza))
