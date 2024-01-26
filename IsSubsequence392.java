package org.leetcode;

public class IsSubsequence392 {
    public boolean isSubsequence(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        int i = 0;
        int j = 0;

       while(i<s.length() && j <t.length()) {
           if(s1[i] == s2[j]) {
               i++;
               j++;
           } else{
               j++;
           }
       }

       if(i==s.length()) {
           return true;
       }
       else return false;


        //return true;
    }
    public static void main(String args[]) {
        IsSubsequence392 isSubsequence392 = new IsSubsequence392();
        System.out.println(isSubsequence392.isSubsequence("ace","axcde"));
    }
}
