(ns ns-example.core
  ; (:use [clojure.string :only [reverse]])
  (:use [clojure.string :only [reverse] :rename {reverse rev}]
        [ns-example.pizza :only [count] :rename {count pizza-count}])
  (:require [ns-example.pizza :as p :refer [get-pizza-slice]]))

(rev "hey")

p/count
pizza-count

; (use 'ns-example.pizza)
;
; (get-pizza-slice)

; (use '[ns-example.pizza :only [get-pizza-slice]])
; (use '[ns-example.pizza :exclude [get-pizza-slice]])

; (get-pizza-slice)
;
; pizza-rating-map

; (require '[ns-example.pizza])
; (require '[ns-example.pizza])
; (require '[ns-example.pizza :as p :refer [get-pizza-slice]])

; (p/get-pizza-slice)

; (p/get-rating ::p/margerita)

; (require '[ns-example.pizza :as p :refer [get-pizza-slice]] :verbose :reload)
