
package com.regex.expr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.regex.*;


public class Splitter2  {
	public int x = 333;
	
	public static void main(String[] args)throws Exception {
	TreeMap<String , String> x1 = new TreeMap();
	ArrayList<ColumnValQueryValDTO> data = new ArrayList();
	
//	x1.put("hello".toLowerCase(), "5");
//	x1.put("garbalge".toLowerCase(), "44");
//	x1.put("Hello".toLowerCase(), "5");
//	x1.put("Garbalge".toLowerCase(), "44");
//	x1.put("aello".toLowerCase(), "5");
//	x1.put("barbalge".toLowerCase(), "44");
//	for (Map.Entry x11 : x1.entrySet()) {
//		System.out.println(x11.getKey() + " sap " + x11.getValue()+" \n ");
//		
//		
//	}
	sorting s = new sorting();
	//System.out.println("---------------sorting ------------------- ");
	
	//s.printMap(x1);
	String str = "hello world";
   PrintWriter pw = new PrintWriter("C:\\Users\\USER\\eclipse-workspace\\test\\src\\com\\regex\\expr\\output.txt");
	
	
	
	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\USER\\eclipse-workspace\\test\\src\\com\\regex\\expr\\input.txt"));
	String line = br.readLine();
	while(line!=null) {
	String tokens[] = line.split("VALUES");


	String[] inner = tokens[1].split(",");
	for ( String c : inner) {
		//System.out.print(c.replace("(","").replace(")", "").replace(";", ""));
		//x1.put(inner[5], line);
		//data.add(new ColumnValQueryValDTO(inner[5] , line) );
		
		
	}
	
	data.add(new ColumnValQueryValDTO(inner[5] , line) );
	System.out.println("");
	line = br.readLine();
	//Arrays.fill(tokens, null);
	
	}
	Collections.sort(data , new  Sortbyroll());
	// printout out the  sorted sql queries b y 
	//s.printMap(x1);
	System.out.println("******************* final result ***************** ");
	for (int i=0; i<data.size(); i++)
        System.out.println(data.get(i).getQueryVal());
	}
	
}
