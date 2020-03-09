package com.samples.arrays;

public class MinAndMaxValues {

	
public static void main(String[] args) {
		
		
		int[] arr= {1,23,43,2,33,44,55,44,22,29,3,54};
		System.out.print(minValue(arr));
		System.out.print(maxValue(arr));
}

private static int maxValue(int[] arr) {
	int i; 
    
    // Initialize maximum element 
    int max = arr[0]; 
   
    // Traverse array elements from second and 
    // compare every element with current max   
    for (i = 1; i < arr.length; i++) 
        if (arr[i] > max) 
            max = arr[i]; 
   
    return max; 	
}

private static int minValue(int[] arr) {
	  // Initialize maximum element 
	
	int i;
    int min = arr[0]; 
   
    // Traverse array elements from second and 
    // compare every element with current max   
    for (i = 1; i < arr.length; i++) 
        if (arr[i] < min) 
            min = arr[i]; 
   
    return min; 	
}
}
