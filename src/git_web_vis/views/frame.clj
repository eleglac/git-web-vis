(ns git-web-vis.views.frame
  
  (:require [clojure.string           :as s]
            [git-web-vis.views.common :as cmn]
            [git-web-vis.views.script :as scr])
  
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(def path "/home/eleglac/Code/git-web-vis/src/git_web_vis/views/")

(def testcode 
  (map (fn [filename] (slurp (str path filename))) ["procd_common.html" "procd_frame.html" "procd_script.html"]))

(defpage "/" []
  (cmn/layout
    (scr/make-code-block testcode)))

