(ns git-web-vis.views.welcome
  (:require [git-web-vis.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to git-web-vis"]))
