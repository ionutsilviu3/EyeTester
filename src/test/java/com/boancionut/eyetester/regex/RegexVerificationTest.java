package com.boancionut.eyetester.regex;

import com.boancionut.eyetester.RegexVerification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexVerificationTest {
    @Test
    void validateEmail() {
        assertEquals(RegexVerification.state.VALID,RegexVerification.validateEmail("user@mail.com"));
    }

    @Test
    void validateUsername() {
        assertEquals(RegexVerification.state.VALID,RegexVerification.validateUsername("Username"));
    }

    @Test
    void validatePassword() {
        assertEquals(RegexVerification.state.VALID,RegexVerification.validatePassword("Password1"));
    }

}