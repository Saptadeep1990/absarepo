package com.regex.expr;

import java.util.TreeSet;

public class DhanashriClasses {
	public static TreeSet<String> filterTreeSet(TreeSet<String> ts1) {
		TreeSet<String> tx = new TreeSet<>();
		for (String x : ts1) {
			if (x != null) {
				tx.add(x.toLowerCase());
			}
		}
		return tx;
	}
	
	public static void main(String[] dhana)
	{
	TreeSet<String> ts = new TreeSet<>();
	ts.add("saptadee");ts.add("love");ts.add("Love" );
	ts.add("dhanashree");
//	StringBuilder sb = new StringBuilder("DhanaS");
//	ts.add(sb);
	
	ts = filterTreeSet(ts);
	for (String x : ts) 
		System.out.println(x);
	
	}
}
