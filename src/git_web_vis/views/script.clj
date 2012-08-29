(ns git-web-vis.views.script
  
  (:require [git-web-vis.views.common :as cmn])
  
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers]))


(def test-snip
  (slurp "/home/eleglac/Code/git-web-vis/src/git_web_vis/views/script.clj"))

(defpartial make-code-block [snippets]
  [:div#code-block
    [:ul {:class "frames"}
      (map-indexed
        (fn [index snippet] 
          [:li 
            [:a {:href "#" :tabindex "1"} (str index) 
            snippet]])
        snippets)]])

