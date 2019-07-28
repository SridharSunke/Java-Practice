package com.samples.fileParsing;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class ParseTestFile {
public static void main(String[] args) throws IOException {
	File f= new File("c:\\text.txt");
	Reader fis = new FileReader(f);
	BufferedReader  buff =new BufferedReader (fis);
	
	if(buff.readLine()!=null){
		
		StringTokenizer st = new StringTokenizer(buff.readLine(),","); 
		
		
	}
	
	
}
}
