(ns forclojure-solutions.core)

;; Nothing but the Truth
true

;; Simple Math
4

;; Intro to Strings
"HELLO WORLD"

;; Intro to Lists
:a :b :c

;; Vectors: conj
[1 2 3 4]

;; Intro to Sets
#{:a :b :c :d}

;; Sets: conj
2

;; Intro to Maps
20

;; Maps: conj
[:b 2]

;; Intro to Sequences
3

;; Sequences: rest
[20 30 40]

;; Intro to Functions
8

;; Double Down
#(* % 2)

;; Hello World
#(str "Hello, " % "!")

;; Sequences: map
[6 7 8]

;; Sequences: filter
[6 7]

;; Last Element
(comp first rseq vec)

;; Penultimate Element
(comp first (partial take-last 2))

;; Nth Element
#(let [list %1 n %2] (if (= n 0) (first list) (recur (rest list) (dec n))))
