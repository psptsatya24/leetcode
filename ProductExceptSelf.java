package org.leetcode;

public class ProductExceptSelf {
    public int[] getProduct(int[] product) {

       int resultArray[] = new int[product.length];
       int   leftArray[] = new int[product.length];
       int  rightArray[] = new int[product.length];
       int leftCurrentProduct = 1;
       int rightCurrentProduct = 1;
        //array : 1,2,3,4
        //left array : 1, 1, 2, 6
        leftArray[0] =1;
        rightArray[product.length-1] = 1;
        for (int i =1 ; i< product.length; i++) {
            leftArray[i] = leftCurrentProduct * product[i-1];
            leftCurrentProduct = leftArray[i];
        }

        //right array : 12, 6, 4,1
        for ( int i = product.length-2 ; i >=0 ; i--){
            rightArray[i] = rightCurrentProduct * product[i+1];
            rightCurrentProduct = rightArray[i];
        }

        for ( int k = 0; k < product.length ; k++ ){
            resultArray[k] = leftArray[k] * rightArray [k] ;
        }

       return resultArray;
    }

    public static void main(String args[]) {
        ProductExceptSelf p = new ProductExceptSelf();
        int[] array1 = {-1,1, 0, -3, 3};
        int[] result =  p.getProduct(array1);
        for(int i : result){
            System.out.println(i);
        }

    }
}
