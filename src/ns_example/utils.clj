(ns ns-example.utils
  (:import (java.util UUID Date)))

; (import 'java.util.UUID)
; (import '(java.util UUID Date))

; (defn get-uuid []
;   (str (java.util.UUID/randomUUID)))
;
; (defn get-date []
;   (java.util.Date.))

(defn get-uuid []
  (str (UUID/randomUUID)))

(defn get-date []
  (Date.))

(comment
  (get-uuid)
  (get-date))
