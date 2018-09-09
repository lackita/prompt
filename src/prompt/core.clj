;; Copyright 2018 Colin Williams
;; This file is part of prompt.

;; prompt is free software: you can redistribute it and/or modify
;; it under the terms of the GNU General Public License as published by
;; the Free Software Foundation, either version 3 of the License, or
;; (at your option) any later version.

;; prompt is distributed in the hope that it will be useful,
;; but WITHOUT ANY WARRANTY; without even the implied warranty of
;; MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;; GNU General Public License for more details.

;; You should have received a copy of the GNU General Public License
;; along with prompt.  If not, see <https://www.gnu.org/licenses/>.

(ns prompt.core)

(defn start [response]
  (loop [action {}]
    (if (action :message) (println (action :message)))
    (print "# ")
    (flush)
    (let [action (response (read-line))]
      (if (not (action :quit))
        (recur action)))))
