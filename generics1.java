package com.regex.expr;
import java.util.*;

public class generics1 {

	public static void main(String[] sx) {

		//	List<Integer> ints = Arrays.asList(1,2,3);
//	int s = 0;
//	for (int n : ints) { s += n; }
//	assert s == 6;
//	
//	List<Integer> l = Arrays.asList(3,4,5);
//	int sum = 0;
//	for (int itr_l : l ) {
//		sum = sum + itr_l;
//	}
//	System.out.println(sum==12);
//	List ints3 = Arrays.asList(new Integer[] {
//			new Integer(1) , new Integer(2) , 
//			new Integer(3) });
//	int sum3 = 0;
//	for (Iterator it = ints.iterator(); it.hasNext();) {
//		int number = ((Integer)it.next()).intValue();
//		
//		sum3 += number;
//	
//	}
//	System.out.println(sum3 == 6);
//	
//	
//	
//	int[] ints = new int[] { 1 ,3 ,3 } ;
//	int s = 0 ; 
//	for ( int i = 0 ; i < ints.length ; i++) {
//		s+= ints[i];
//		
//	}
//	System.out.println(s==7);
//		List<String> words = new ArrayList<String>();
//		words.add("hello");
//		words.add("world!");
//		String s = words.get(0) + words.get(1);
//		System.out.println(s.equals("helloworld!"));
//		
//
		List w = new ArrayList();
		w.add("h");
		w.add("wo");
		String s = (String)w.get(0) + (String)w.get(1);
		System.out.println(s.equals("hwo"));
}
}
