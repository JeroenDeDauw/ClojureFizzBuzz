(use 'clojure.test)

(defn fizz-buzz [number] (
  if (= number 3)
    "Fizz"
    (str number)
))

(deftest one-is-returned-as-is (is (= "1" (fizz-buzz 1))))
(deftest two-is-returned-as-is (is (= "2" (fizz-buzz 2))))
(deftest three-is-fizz (is (= "Fizz" (fizz-buzz 3))))
;(deftest five-is-buzz (is (= "Buzz" (fizz-buzz 5))))

(run-tests)