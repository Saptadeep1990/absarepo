package com.regex.expr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.regex.*;



public class MobileExtractor  {

	public static void main(String[] args) {
	Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
	try {
	PrintWriter pw = new PrintWriter("C:\\Users\\USER\\eclipse-workspace\\test\\src\\com\\regex\\expr\\output.txt");
	
	
	
	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\USER\\eclipse-workspace\\test\\src\\com\\regex\\expr\\input.txt"));
	String line = br.readLine();
	
	while(line!=null) {
		Matcher m = p.matcher(line);
		while(m.find() ) {
			pw.println(m.group());
		}
		line = br.readLine();
	}
	pw.flush();
	pw.close();
	br.close();
	
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}

	}

}
