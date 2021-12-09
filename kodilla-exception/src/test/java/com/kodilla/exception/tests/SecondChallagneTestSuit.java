package com.kodilla.exception.tests;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SecondChallengeTestSuit {

    @Test
    void testSecondChallenge() {
        // given
       SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5,2));
    }
    @Test
    void whenConditionsAreMet() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5,2));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5,2));
    }

}
