(ns clojure-fizz-buzz.core)

(defn is-divisible [number devisor] (== 0 (mod number devisor)))

(defn fizz-buzz [number]
  (if (is-divisible number 15)
    "FizzBuzz"
    (if (is-divisible number 3)
      "Fizz"
      (if (is-divisible number 5)
        "Buzz"
        (str number)
      )
    )
  )
)

