(ns clojure-fizz-buzz.core-test
  (:require [clojure.test :refer :all]
            [clojure-fizz-buzz.core :refer :all]))

(deftest one-is-returned-as-is (is (= "1" (fizz-buzz 1))))
(deftest two-is-returned-as-is (is (= "2" (fizz-buzz 2))))
(deftest three-is-fizz (is (= "Fizz" (fizz-buzz 3))))
(deftest five-is-buzz (is (= "Buzz" (fizz-buzz 5))))
(deftest six-is-fizz (is (= "Fizz" (fizz-buzz 6))))
(deftest fifteen-is-fizzbuzz (is (= "FizzBuzz" (fizz-buzz 15))))

(run-tests)