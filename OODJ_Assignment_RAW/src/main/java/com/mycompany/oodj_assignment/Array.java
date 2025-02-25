
package com.mycompany.oodj_assignment;

public class Array {
    
    public static String[] appendStrings(String[] arr, String str){
        String[] newArr = new String[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = str;
        return newArr;
        
   }
}
