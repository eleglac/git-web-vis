(ns git-web-vis.servegrab.clj
  (:require [clj-http.client :as client]))

(:status (client/get "http://127.0.0.1:8080"))
