package com.samples.oops;

public class MethodsWithDiffAccModSamples {
//
	
	private static void display(int a){
        System.out.println("Arguments: " + a);
    }
	//we can send diff return types
    private static int display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
		return b;
    }
    
    //we can have diff acess midifer also
    public static int display(int a, int b, int c){
        System.out.println("Arguments: " + a + " and " + b);
		return b;
    }
//    private static void display(int a, int b){
//        System.out.println("Arguments: " + a + " and " + b);
//    }
}
