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

;; Count a Sequence
#(loop [l % n 0] (if (seq l) (recur (rest l) (+ n 1)) n))

;; Reverse
#(reduce (fn [x y] (conj x y)) '() %)
#(reduce (fn [l1 l2] (concat [l2] l1)) '() %)

;;Sum It All Up
#(reduce (fn [n m] (+ n m)) %)

;;Find the odd numbers
#(filter (comp not even?) %)
#(reduce (fn [l n] (if (even? n) l (cons n l))) '() %)

;;Fibonacci sequence
#(take % ((fn fib [a b] (cons a (lazy-seq (fib b (+ b a))))) 1 1))

;;Pallindrome Detector
#(= (seq %) (reverse %))

;;Flatten a Sequence
(fn flt [o] (reduce (fn [l e] (let [e2 (if (coll? e) (flt e) [e])] (do (concat l e2)))) '() o)) ;; can't use defn
(defn flt [o] (if (coll? o) (let [h (first o) t (rest o)] (concat [h] (flt t))) [o])) ;; stack excpeion

;;Get the Caps
#(apply str (filter (fn [c] (Character/isUpperCase c)) %))

;;Compress a sequence
#(reduce (fn [l e] (if (= (last l) e) l (concat l [e]))) '() %)

;;Pack a sequence
#(reduce (fn [res el] (let [list (last res) current (first list) list_wo_last (pop res)] (if (or (= current el) (= current nil)) (conj list_wo_last (conj list el)) (conj res (conj '() el))))) [[]] %)

;;Duplicate a Sequence
#(reduce (fn [res el] (conj (conj res el) el)) [] %)
