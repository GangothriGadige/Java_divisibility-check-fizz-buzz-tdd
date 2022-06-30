package org.tw;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Nested
    class Requirement1 {
        @Test
        void ShouldReturnFizzWhen6IsDividedBy3() {
            FizzBuzz fizzBuzz = new FizzBuzz(6);
            String expectedResult = "Fizz";

            String actualResult = fizzBuzz.fizz();

            assertEquals(expectedResult,actualResult);
        }

        @Test
        void ShouldReturnNullWhen7IsDividedBy3() {
            FizzBuzz fizzBuzz = new FizzBuzz(7);
            String expectedResult = null;

            String actualResult = fizzBuzz.fizz();

            assertEquals(expectedResult, actualResult);
        }

        @Test
        void ShouldReturnFizzWhen66IsDividedBy3() {
            FizzBuzz fizzBuzz = new FizzBuzz(66);

            String expectedResult = "Fizz";

            String actualResult = fizzBuzz.fizz();

            assertEquals(expectedResult, actualResult);
        }

        @Test
        void ShouldReturnBuzzWhen10IsDividedBy5() {
            FizzBuzz fizzBuzz = new FizzBuzz(10);
            String expectedResult = "Buzz";

            String actualResult = fizzBuzz.buzz();

            assertEquals(expectedResult, actualResult);
        }

        @Test
        void ShouldReturnNullWhen99IsDividedBy5() {
            FizzBuzz fizzBuzz = new FizzBuzz(99);
            String expectedResult = null;

            String actualResult = fizzBuzz.buzz();

            assertEquals(expectedResult, actualResult);
        }
    }
    @Nested
    class Requirement2 {
        @Test
        void ShouldReturnFizzWhen99IsDividedBy3() {
            FizzBuzz fizzBuzz = new FizzBuzz(99);
            String expectedResult = "Fizz";

            String actualResult = fizzBuzz.modifiedFizz();

            assertEquals(expectedResult, actualResult);

        }

        @Test
        void ShouldReturnFizzWhen13IsDividedBy3() {
            FizzBuzz fizzBuzz = new FizzBuzz(13);
            String expectedResult = "Fizz";

            String actualResult = fizzBuzz.modifiedFizz();

            assertEquals(expectedResult, actualResult);

        }

        @Test
        void ShouldReturnNullWhen25IsDividedBy3() {
            FizzBuzz fizzBuzz = new FizzBuzz(25);
            String expectedResult = null;

            String actualResult = fizzBuzz.modifiedFizz();

            assertEquals(expectedResult, actualResult);

        }

        @Test
        void ShouldReturnFizzWhen33IsDividedBy3() {
            FizzBuzz fizzBuzz = new FizzBuzz(33);
            String expectedResult = "Fizz";

            String actualResult = fizzBuzz.modifiedFizz();

            assertEquals(expectedResult, actualResult);

        }

        @Test
        void ShouldReturnFizzWhen55IsDividedBy5() {
            FizzBuzz fizzBuzz = new FizzBuzz(55);
            String expectedResult = "Fizz";

            String actualResult = fizzBuzz.modifiedBuzz();

            assertEquals(expectedResult, actualResult);

        }

        @Test
        void ShouldReturnFizzWhen95IsDividedBy5() {
            FizzBuzz fizzBuzz = new FizzBuzz(95);
            String expectedResult = "Fizz";

            String actualResult = fizzBuzz.modifiedBuzz();

            assertEquals(expectedResult, actualResult);

        }

        @Test
        void ShouldReturnFizzWhen59IsDividedBy5() {
            FizzBuzz fizzBuzz = new FizzBuzz(59);
            String expectedResult = "Fizz";

            String actualResult = fizzBuzz.modifiedBuzz();

            assertEquals(expectedResult, actualResult);

        }

        @Test
        void ShouldReturnNullWhen98IsDividedBy5() {
            FizzBuzz fizzBuzz = new FizzBuzz(98);
            String expectedResult = null;

            String actualResult = fizzBuzz.modifiedBuzz();

            assertEquals(expectedResult, actualResult);

        }

        @Test
        void ShouldReturnFizzBuzzWhen60IsDividedBy3And5() {
            FizzBuzz fizzBuzz = new FizzBuzz(60);
            String expectedResult = "FizzBuzz";

            String actualResult = fizzBuzz.fizzBuzz();

            assertEquals(expectedResult, actualResult);

        }

        @Test
        void ShouldReturnNUllWhen10IsDividedBy3And5() {
            FizzBuzz fizzBuzz = new FizzBuzz(10);
            String expectedResult = null;

            String actualResult = fizzBuzz.fizzBuzz();

            assertEquals(expectedResult, actualResult);

        }

        @Test
        void ShouldReturnNUllWhen21IsDividedBy3And5() {
            FizzBuzz fizzBuzz = new FizzBuzz(21);
            String expectedResult = null;

            String actualResult = fizzBuzz.fizzBuzz();

            assertEquals(expectedResult, actualResult);

        }
    }

}
