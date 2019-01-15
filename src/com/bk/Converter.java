package com.bk;

import java.math.BigInteger;

class Converter {

    public BigInteger titleToNumber(String s) {
        s = s.toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            if (!Character.isLetter(letter)) {
                System.out.println("You must enter a valid letter!");
                break;
            } else if (s.length() > 20) {
                System.out.println("You may enter 20 letters max!");
                break;
            }
        }

        BigInteger result = BigInteger.valueOf(0);
        for (int i = s.length() - 1; i >= 0; i--) {
            result = result.add(BigInteger.valueOf((long)Math.pow(26, s.length() - i - 1)).multiply(BigInteger.valueOf((long)s.charAt(i) - 64)));
        }
        return result;

    }

    public String numberToTitle(String s) {

        for (int i = 0; i < s.length(); i++) {
            char digit = s.charAt(i);
            if (!Character.isDigit(digit)) {
                System.out.println("You must enter a valid digit!");
                break;
            } else if (s.length() > 20) {
                System.out.println("You may enter 20 digits max!");
                break;
            }
        }

        String result = "";
        BigInteger n = new BigInteger(s);
        while (n.compareTo(BigInteger.ZERO) > 0) {

            n = n.subtract(BigInteger.valueOf(1));

            result = String.valueOf((char) n.mod(BigInteger.valueOf(26)).add(BigInteger.valueOf(65)).intValue()) + result;
            n = n.divide(BigInteger.valueOf(26));
        }
        return result;
    }

}
