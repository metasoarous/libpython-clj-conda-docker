(ns user
  (:require [libpython-clj2.require :refer [require-python]]
            [libpython-clj2.python :as py :refer [py. py.. py.-]]
            [libpython-clj2.python.np-array :as np-array]))


(System/getenv "LD_LIBRARY_PATH")

;(require '[clojure.java.shell :as sh])
;(println (:out (sh/sh "python3-config" "--prefix")))

(py/initialize!)
(require-python 'math)
(math/cos math/pi)

(require-python '[numpy :as np])

;(def test-ary (np/array [[1 2] [3 4]]))

;test-ary

;(require-python '[sklearn.datasets :as sk-data])
;(require-python '[sklearn.model_selection :as sk-model])
;(require-python '[sklearn.decomposition :as sk-decomp])

