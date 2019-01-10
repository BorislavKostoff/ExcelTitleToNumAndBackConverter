package com.bk;

class Converter {

    public int titleToNumber(String s) {
        s = s.toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            if (!Character.isLetter(letter)) {
                System.out.println("You must enter a valid letter!");

            }
        }
        int n = s.length();
        int result = 0;
        for (int i = n - 1; i >= 0; i--) {
            result += Math.pow(26, n - i - 1) * (s.charAt(i) - 64);
        }
        return result;

    }

    public String numberToTitle(String s) {
        for (int i = 0; i < s.length(); i++) {
            char digit = s.charAt(i);
            if (!Character.isDigit(digit)) {
                System.out.println("You must enter a valid digit!");
            }
        }

        String result = "";
        int n = Integer.parseInt(s);
        while (n > 0) {

            n--;
            result = String.valueOf((char) (n % 26 + 'A')) + result;
            n /= 26;
        }
        return result;
    }

}
