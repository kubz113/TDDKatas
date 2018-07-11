# Test Driven Development Katas

This repository contains kata problems solved following test driven development practices.

## [Bowling Kata](https://github.com/kubz113/TDDKatas/tree/master/BowlingKata)

Implement a class that calculates the score of a given bowling game. The idea to implement this kata was taken from http://www.peterprovost.org/blog/2012/05/02/kata-the-only-way-to-learn-tdd/. The scoring of bowling depends on many conditions, which provide many different scenarios for unit test. I would recommend writing unit tests that check strike and spare scoring because they produce special situations in scoring the current and subsequent frames. I also would recommend writing multiple tests for tenth frame scenarios.

## [Prime Factors](https://github.com/kubz113/TDDKatas/tree/master/PrimeFactorsKata)

This class implements a function that returns a list of the prime factors of a given integer. The idea to implement this kata was take from http://osherove.com/tdd-kata-1/. This kata was proven useful, because I refactored my solution multiple times. The recommended unit tests are pretty straight forward; just go in order starting at one and continuing until your solution passes the test without a code change.
