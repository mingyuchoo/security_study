package com.mgchoo.security2.util;

import java.math.BigInteger;
import java.security.SecureRandom;

public final class RandomGenerator {
    private SecureRandom random = new SecureRandom();

    public String nextString() {
      return new BigInteger(130, random).toString(32);
    }
  }