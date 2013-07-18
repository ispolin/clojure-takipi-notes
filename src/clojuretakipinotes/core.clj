(ns clojuretakipinotes.core
    (:gen-class))

(defmacro infix-macro-test [form]
   (list (second form) (first form) (nth form 2)))

(defn null-pointer-test [chr]
  (doseq [x '(1 2 3 4)] 
         ((println x)
          (println chr))))

(defn illegal-agument-test [mystr]
 (case mystr
       "" 0
       "hello" (count mystr)))

(defn stack-overflow-test 
  "WARNING: Crashes JVM, takipi-agent, AND screws up shell the jar was ran from. 
  Kill takipi-agent and shell after running this."
  [count]
  (print ".")
  (stack-overflow-test (inc count)))


(defn -main
  [& test-name]
  (try
    (case test-name
      "null-pointer-test" (null-pointer-test \.)
      "illegal-argument-test" (illegal-agument-test "foo")
      "stack-overflow-test" (stack-overflow-test 1) 
      "macro-test" (infix-macro-test (1 / 0))
      (println "\nPlease wait for the connection indicator in Takipi to turn green and then specify the test you'd like to run.\nValid options are:
                null-pointer-test
                illegal-argument-test
                macro-test
                stack-overflow-test (WARNING: this one will do bad bad things to jvm, takipi-agent, and your shell. You will have to kill all those processes after running this test.)"))
    (catch Exception e (println e)))
  (println "\nPlease specify a test or press Ctrl-c to exit:")
  (recur (read-line)))
