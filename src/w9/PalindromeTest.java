package w9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void checkEmptyString() {
        assertTrue(TestDemo.palindrome(""), "The empty string should be a palindrome");
    }
    @Test
    void checkPalindrome() {
        assertTrue(TestDemo.palindrome("kayak"), "Palindromes should be correctly recognized");
    }

    @Test
    void checkNumberPalindrome() {
        assertTrue(TestDemo.palindrome("5225"), "Palindromes should be correctly recognized, even if they have numbers");
    }
    @Test
    void checkMixedCasePalindromes() {
        assertTrue(TestDemo.palindrome("KayAk"), "Palindromes should be correctly recognized, even if they have upper and lower case characters");
    }
    @Test
    void checkNonPalindrome() {
        assertFalse(TestDemo.palindrome("Programming"), "Non Palindromes should be correctly recognized");
    }
}