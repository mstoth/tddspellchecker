This is an implementation of the spell-checker tutorial
found at https://github.com/BernhardWenzel/clojure-spell-checker-beginner-tutorial

I am new to clojure and I wanted to use Test Driven Development (TDD) on the project.
Each commit in this project takes you from a RED state to a GREEN state through the whole
project.  

I used eclipse as an IDE and the Counterclockwise eclipse plug-in
(by Counterclockwise Team) 
It can be found in the Eclipse Marketplace by searching for clojure

The log illustrates the steps. Of course the time progresses from bottom to top.


61958f6 (HEAD -> master, origin/master, origin/HEAD) passes all tests

ec1dd0e passes -main with words test

b0a60b1 fails main-with-words

a09ad7e passes min-distance with words

4c8c17e fails using min-distance with words

000e49c passes min-distance test with Spilling and Spelling

246ea4d fails min-distance test

39aa07e distance passes

e0d545d fails the test for distance

43ef163 passes -main test

4977485 fails for the test that -main works

cc2fae1 passes test that correct? works for the letter 'a'

6e1deaa fails checking if correct? works properly for one known word

9f8bebe passes check for correct? function

901ca47 fails checking for correct? function

cf3b344 passing test of words as a set

ab9930b creates words

5581c8a passes word existence test

61292dc added words file

885899f eclipse project created

faf176b created app

d65f130 first commit
