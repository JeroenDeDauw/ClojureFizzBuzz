(use 'clojure.test)

(defn fizz-buzz [number] 1)

(deftest one-is-returned-as-is (is (= 1 (fizz-buzz 1))))

(run-tests)