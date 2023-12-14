package org.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords_151 {

    public String reverseWords(String s) {
       //remove trailing spaces
        s = s.trim();
      String finalString = "";
      int spaceIndex = 0;
      int wordIndex = 0;
      String wordCurrent = "";

        char[] word = s.toCharArray();
      while (spaceIndex < s.length()) {
          while (spaceIndex < s.length() && Character.isSpaceChar(word[spaceIndex])) {
              spaceIndex++;
          }
          while (wordIndex < s.length() && !(Character.isSpaceChar(word[wordIndex]))) {
              wordIndex++;
          }
          if(wordIndex > spaceIndex) {
              wordCurrent = s.substring(spaceIndex, wordIndex);
              if (spaceIndex ==0 )
                  finalString = wordCurrent;
              else
                  finalString = wordCurrent + " " +finalString;
          }
          wordCurrent = "";
          if( wordIndex > spaceIndex) spaceIndex =  wordIndex ;
          else wordIndex =  spaceIndex ;
      }
        return finalString;
    }

    public static void main(String args[]) {

        ReverseWords_151 reverseWords151 = new ReverseWords_151();
        System.out.println(reverseWords151.reverseWords("the sky is blue"));

    }
}
