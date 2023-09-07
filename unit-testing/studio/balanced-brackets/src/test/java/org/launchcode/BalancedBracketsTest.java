package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void endBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }
    @Test
    public void beginningBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void middleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[]Code"));
    }
    @Test
    public void beginningBracketEndBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void multipleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }
    @Test
    public void crazyBracketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void endCrazyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]["));
    }
    @Test
    public void middleCrazyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch][Code"));
    }
    @Test
    public void beginningCrazyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(("][LaunchCode")));
    }

    @Test
    public void beginningEndCrazyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }
    @Test
    public void unpairedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"));
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}