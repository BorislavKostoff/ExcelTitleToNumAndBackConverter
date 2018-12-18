package com.bk;

public class Main {
    public static void main(String[] args) {

        System.out.println(titleToNumber("AA"));
        System.out.println(numberToTitle(27));
    }

    private static int titleToNumber(String s) {
        if(s == null || s.length() == 0){
            throw new IllegalArgumentException("Input is not valid!");
        }
        int n = s.length();
        int result = 0;
        for(int i = n-1; i >= 0; i--){
            result += Math.pow(26, n-i - 1)*(s.charAt(i) - 64);
        }
        return result;
    }

    private static String numberToTitle(int n){
        if (n == 0) {
            throw  new IllegalArgumentException("Input is not valid!");
        }
        String s = "";
        while(n > 0)
        {
            n--;
            s = String.valueOf((char)(n%26 + 'A')) + s;
            n /= 26;
        }
        return s;
    }
}
