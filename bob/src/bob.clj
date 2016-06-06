 (ns bob)

(defn is-only-number?
  [word]
  (not (re-find #"[A-Za-z]" word)))

(defn is-a-shout
   [word]
   (if (and (not (is-only-number? word))
            (= word (.toUpperCase word)))
     "Whoa, chill out!"))

(defn is-a-question
   [word]
  (if (.endsWith word "?")
    "Sure."))

 (defn is-nothing
   [word]
   (if (.isEmpty (.trim word))
     "Fine. Be that way!"))

(defn response-for
 [word]
 (or
   (is-nothing word)
   (is-a-shout word)
   (is-a-question word)
   "Whatever."))