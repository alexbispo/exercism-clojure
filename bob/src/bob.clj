 (ns bob)

(defn is-only-number?
  [word]
  (not (re-find #"[A-Za-z]" word)))

(defn is-yell?
   [word]
   (if (is-only-number? word)
     false
     (= word (.toUpperCase word))))

(defn is-a-question?
   [word]
   (and (not (is-yell? word)) (re-find #"\?$" word)))

 (defn response-for
   [word]
   (if (empty? (.trim word))
     "Fine. Be that way!"
     (if (is-a-question? word)
       "Sure."
       (if (is-yell? word)
         "Whoa, chill out!"
         "Whatever."))))