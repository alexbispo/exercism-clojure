 (ns bob)

(defn is-only-number?
  [word]
  (not (re-find #"[A-Za-z]" word)))

(defn shout
   [word]
   (if (and (not (is-only-number? word))
            (= word (.toUpperCase word)))
     "Whoa, chill out!"))

(defn question
   [word]
  (if (.endsWith word "?")
    "Sure."))

 (defn nothing
   [word]
   (if (.isEmpty (.trim word))
     "Fine. Be that way!"))

(defn response-for
 [word]
 (or
   (nothing word)
   (shout word)
   (question word)
   "Whatever."))