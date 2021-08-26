  

package com.regex.expr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.regex.*;


class LineInfo {
	public String firstPart;
	public String lastPart;
	
}

public class SQLExtractor  {

	public static void main(String[] args) {
		
		
	//	String[] s = p1.split("hello wor.ld world");
	//Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
	Pattern p1 = Pattern.compile("VALUES");
	
	try {
		String[] tokensx = new String[100];
	PrintWriter pw = new PrintWriter("C:\\Users\\USER\\eclipse-workspace\\test\\src\\com\\regex\\expr\\output.txt");
	
	
	
	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\USER\\eclipse-workspace\\test\\src\\com\\regex\\expr\\input.txt"));
	String line = br.readLine();
	ArrayList<LineInfo> LineInfoHolder= new ArrayList<>();
	
	while(line!=null) {
		//Matcher m = p.matcher(line);
		String s[] = p1.split(line);
		int count = 0 ; 
		LineInfo info = new LineInfo();
		for (String s1 : s) {
			System.out.println(s1);
		
			if ( count == 0 ) {
			info.firstPart = s1; count++;
			}
			else {
				info.lastPart = s1; 
				
				Pattern commax = Pattern.compile(",");
			 tokensx = commax.split(s1);
				
			}
		
			
			
			
		}
		LineInfoHolder.add(info);
//		while(m.find() ) {
//			pw.println(m.group());
//		}
		line = br.readLine();
	}
	//Pattern comma = Pattern.compile(",");
	//String[] tokens = comma.split("hello , sfsdf , sfsf )");
	for (String s : tokensx) {
		s = s.replace("(", "").replace(")", "");
		System.out.println(s);
		
	}
	System.out.println("tokenx index 3"+tokensx[3]);
	for (LineInfo l : LineInfoHolder) {
		System.out.println(" Line info ");
		System.out.println("first part " + l.firstPart+" \n "+"second part = "+ l.lastPart );
		
	}
	String table_name = "dummy";
	//String query = "delete from "+table_name+"where "+param_1+" = "+" "and 
	
	// Write a tree map to sort data of sql queries here 
	// 
	//
	
	pw.flush();
	pw.close();
	br.close();
	
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}

	}//main

}
