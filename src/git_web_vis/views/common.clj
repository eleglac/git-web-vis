(ns git-web-vis.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5]]))

(defpartial layout [& content]
  (html5
    [:head
      [:title "The Git Visualizer"]
      (include-css "/css/album.css")
      (include-css "/css/code.css")]

      [:body
        [:div#wrapper content]]))
