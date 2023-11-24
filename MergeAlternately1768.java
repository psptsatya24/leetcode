package org.leetcode;

public class MergeAlternately1768 {

    private String getMergeString(String a, String b) {
        String finalResult ="";
        //1. Case 1 if both strings are equal

        if (a.length()== b.length()) {
            for( int i =0 ; i < a.length() ; i++) {
                finalResult = finalResult + String.valueOf(a.charAt(i)) + String.valueOf(b.charAt(i)) ;
            }
        }

        //2. Case 2 if string a is > string b
        if (a.length()> b.length()) {
            //a = "abc" b = "pq"
            for( int i =0 ; i < a.length() ; i++) {
                if(!(i<b.length()))
                    finalResult = finalResult + String.valueOf(a.charAt(i));
                else
                    finalResult = finalResult + String.valueOf(a.charAt(i)) + String.valueOf(b.charAt(i)) ;
            }

        }


        //3. Case 3 if String a < String b
        if (a.length()< b.length()) {
            //a = "abc" b = "pq"
            for( int i =0 ; i < b.length() ; i++) {
                if(!(i<a.length()))
                    finalResult = finalResult + String.valueOf(b.charAt(i));
                else
                    finalResult = finalResult + String.valueOf(a.charAt(i)) + String.valueOf(b.charAt(i)) ;
            }

        }
        return finalResult;
    }

    public static void main(String args[]){
        MergeAlternately1768 merger = new MergeAlternately1768();
        System.out.println("Result: " +merger.getMergeString("abc", "pqrstu"));
    }
}
