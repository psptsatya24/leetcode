package org.leetcode;

public class GreatestCommonDivisor1071 {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.equalsIgnoreCase(str2)){
            return str2;
        }

       if((str1.startsWith(str2))){
           return gcdOfStrings(str1.substring(str2.length()),str2);
        }

        if(str2.length() > str1.length()) {
            return gcdOfStrings(str2,str1);
        }
        return "";

    }
    public static void main(String args[]){
        GreatestCommonDivisor1071 gcd = new GreatestCommonDivisor1071();
        System.out.println(gcd.gcdOfStrings("ABABAB","ABAB"));
    }
}
