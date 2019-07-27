package com.samples.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EvenOddDifferentSidesArray {

	
static int[] num= {1,11,55,174,22,44,11,1,88,44,57,2};
	

	public static void main(String[] args) {
		int left=0, right =num.length-1;
		while(left<right){
		while(num[left]%2==0 && left<right){
				left++;
			}
			 while (num[right]%2 == 1 && left < right) 
	                right--; 

				if(left<right){
					int temp=num[left];
					num[left]=num[right];
					num[right]=temp;
					left++;
					right--;
				}
		}
		
		Arrays.stream(num).mapToObj(String::valueOf).forEach(s -> System.out.print(s+","));
		System.out.println(Arrays.stream(num).mapToObj(String::valueOf).collect(Collectors.joining(",")));
	}
	
	}
