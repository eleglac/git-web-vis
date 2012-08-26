(ns git-web-vis.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "git-web-vis"]
               (include-css "/css/reset.css")]
              [:body
               [:div#wrapper
                content]]))
