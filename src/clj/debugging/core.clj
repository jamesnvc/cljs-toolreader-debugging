(ns debugging.core
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]))

(defn page
  []
  "<html>
  <head>
  </head>
  <body>
  <div id='app'>Bloop</div>
  <script src='//cdnjs.cloudflare.com/ajax/libs/react/0.9.0/react.min.js'></script>
  <script src='/js/goog/base.js'></script>
  <script src='/js/debugging.js'></script>
  <script>goog.require('debugging.core');</script>
  </body>
  </html>")

(defroutes app-routes
  (GET "/" []
    "<html>
    <head>
    </head>
    <body>
    <div id='app'>Bloop</div>
    <script src='//cdnjs.cloudflare.com/ajax/libs/react/0.9.0/react.min.js'></script>
    <script src='/js/goog/base.js'></script>
    <script src='/js/debugging.js'></script>
    <script>goog.require('debugging.core');</script>
    </body>
    </html>"))

(def app (handler/site
           (routes
             app-routes
             (route/resources "/"))))
