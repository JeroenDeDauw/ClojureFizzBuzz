(use 'clojure.test)

(defn fizz-buzz [number] number)

(deftest one-is-returned-as-is (is (= 1 (fizz-buzz 1))))
(deftest two-is-returned-as-is (is (= 2 (fizz-buzz 2))))

(run-tests)