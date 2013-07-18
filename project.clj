(defproject clojuretakipinotes "0.1.1-SNAPSHOT"
  :description "Small set of examples for experimenting with Takipi SAAS debugger in clojure."
  :url "https://github.com/ispolin/clojure-takipi-notes/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main clojuretakipinotes.core
  :java-opts ["-Dclojure.compiler.disableLocalsClearing=true"]
  :dependencies [[org.clojure/clojure "1.5.1"]])
