(ns clj-sampler.data
  (:require [clojure.java.io :as io]
            [incanter.io :as reader]))

(defmulti load-data identity)

(defmethod load-data :incanter [file_path]
  (-> (io/resource file_path)
      (str)
      (reader/read-dataset :header true)))
