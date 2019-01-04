package com.bk;

class Converter {

    public int titleToNumber(String s) {
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

    public String numberToTitle(int n){
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
