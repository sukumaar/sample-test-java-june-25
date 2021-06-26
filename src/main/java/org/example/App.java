package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public char[] reverseTheArray(char[] arr){
        Character placeHolder= null;
        for (int i = 0; i < arr.length; i++) {
            if(i<arr.length/2) {
                placeHolder = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = placeHolder;
            }
        }
        return arr;
    }

    public void printReverseArray(char[] arr){
        System.out.println(reverseTheArray(arr));
    }
}
