package com.mgchoo.security2.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomGeneratorTest {

    @Test
    public void testNextString() {
        RandomGenerator rg = new RandomGenerator();
        System.out.println(rg.nextString());
        assertNotNull(rg.nextString());
    }
}
