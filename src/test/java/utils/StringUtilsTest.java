package utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber_Ok() {
        Assertions.assertTrue(StringUtils.isPositiveNumber("123"));
    }

    @Test
    void isPositiveNumber_negativeNumber_NotOk() {
        Assertions.assertFalse(StringUtils.isPositiveNumber("-123"));
    }

    @Test
    void isPositiveNumber_zero_NotOk() {
        Assertions.assertFalse(StringUtils.isPositiveNumber("0"));
    }

    @Test
    void isPositiveNumber_nonNumericString_NotOk() {
        Assertions.assertFalse(StringUtils.isPositiveNumber("abc"));
    }

    @Test
    void isPositiveNumber_emptyString_NotOk() {
        Assertions.assertFalse(StringUtils.isPositiveNumber(""));
    }
}