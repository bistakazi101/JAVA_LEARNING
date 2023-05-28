//single dimentional array

import java.util.*;  
public class Java32_array1 {
   
    public static void main(String[] args){
       
    
        System.out.println("Single dimentional array");
        int []arr= new int[5];
        for(int  a = 0; a<=4;a++){
        arr[a]= a;
        System.out.println(arr[a]);
 
        int arr1[]= {1,2,3,4,5};
        //using for each loop
        for(int arra: arr1){
            System.out.println(arra);
        }
    }
    }
}
