(ns guybrush.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[guybrush started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[guybrush has shut down successfully]=-"))
   :middleware identity})
