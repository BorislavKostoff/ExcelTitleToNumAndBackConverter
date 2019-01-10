package com.bk;

class Converter {

    public long titleToNumber(String s) {
        s = s.toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            if (!Character.isLetter(letter)) {
                System.out.println("You must enter a valid letter!");
break;
            }
        }

        long result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            result += Math.pow(26, s.length() - i - 1) * (s.charAt(i) - 64);
        }
        return result;

    }

    public String numberToTitle(String s) {
        if (s.length() > 18) {
            System.out.println("You may enter 18 digits max!");
        }
        for (int i = 0; i < s.length(); i++) {
            char digit = s.charAt(i);
            if (!Character.isDigit(digit)) {
                System.out.println("You must enter a valid digit!");
                break;
            }
        }

        String result = "";
        long n = Long.parseLong(s);
        while (n > 0) {

            n--;
            result = String.valueOf((char) (n % 26 + 'A')) + result;
            n /= 26;
        }
        return result;
    }

}
