(ns clj-sampler.data
  (:require [clojure.java.io :as io]
            [incanter.io :as reader]))

(defn load-incanter-data [file_path]
  (-> (io/resource file_path)
      (str)
      (reader/read-dataset :header true)))

(load-incanter-data "iris.csv")
