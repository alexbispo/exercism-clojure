 (ns bob)

(defn is-only-number?
  [word]
  (not (re-find #"[A-Za-z]" word)))

(defn is-a-shout?
   [word]
   (if (not (is-only-number? word))
     (= word (.toUpperCase word))))

(defn is-a-question?
   [word]
   (and (not (is-a-shout? word)) (.endsWith word "?")))

 (defn response-for
   [word]
   (cond
     (.isEmpty (.trim word)) "Fine. Be that way!"
     (is-a-question? word) "Sure."
     (is-a-shout? word) "Whoa, chill out!"
     :else "Whatever."))