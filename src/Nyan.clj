(use 'clojure.test)

(defn is-divisible [number devisor] (== 0 (mod number devisor)))

(defn fizz-buzz [number]
  (if (is-divisible number 3)
    "Fizz"
    (if (is-divisible number 5)
      "Buzz"
      (str number)
    )
  )
)

(deftest one-is-returned-as-is (is (= "1" (fizz-buzz 1))))
(deftest two-is-returned-as-is (is (= "2" (fizz-buzz 2))))
(deftest three-is-fizz (is (= "Fizz" (fizz-buzz 3))))
(deftest five-is-buzz (is (= "Buzz" (fizz-buzz 5))))
(deftest six-is-fizz (is (= "Fizz" (fizz-buzz 6))))

(run-tests)