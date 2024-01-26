package org.leetcode;

public class StringCompression443 {

    public int compress(char[] chars) {
      String s = "";
      int count = 1;
      int startPointer =0;
      int endPointer = 1;
      int index =0;
      StringBuilder s1 = new StringBuilder();
      while(startPointer < chars.length ) {
          //count =1;
          while (endPointer < chars.length && (chars[startPointer] == chars[endPointer]))
              endPointer++;
          if(endPointer > startPointer+1) {
              count = endPointer - startPointer;
              s1.append(chars[startPointer]);
              s1.append(count);
              chars[startPointer+1] = (char) count;
             // chars[startPointer+1+count-2]
          }
          else {
              s1.append(chars[startPointer]);
          }

          startPointer = endPointer;
          endPointer++;

      }
      System.out.println(s1);
      char[] newArray = (s1.toString()).toCharArray();
     chars= new char[s1.length()];
     // chars = (s1.toString()).toCharArray();
      for(int i=0;i<newArray.length;i++){
            chars[i]=newArray[i];
        }
      System.out.println(chars);
      return chars.length;
    }

    public static void main(String args[]) {
        StringCompression443 compression443 = new StringCompression443();
        char[] array = {'a','b','b','c','c','c'};
        System.out.println(compression443.compress(array));

    }
}
