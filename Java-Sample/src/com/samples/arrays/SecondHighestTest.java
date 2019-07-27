package com.samples.arrays;

public class SecondHighestTest {
		public static void main(String[] args) {
			int[] arr={100,25,1,42,55,69,10,11};
			int[] sorted=new SortArray().sortArray(arr);
			System.out.println(sorted[sorted.length-2]);
		}
}
