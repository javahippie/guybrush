(ns guybrush.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [guybrush.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[guybrush started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[guybrush has shut down successfully]=-"))
   :middleware wrap-dev})
