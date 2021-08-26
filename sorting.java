package com.regex.expr;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class sorting {
    public static <K,V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() 
                + " Value : " + entry.getValue());
        }
    }
    
    public static <K,V> void pM(Map<K, V> map) {
    	for (Map.Entry<K,V> x : map.entrySet()) {
    		System.out.println(x.getKey() + " " + x.getValue()+" \n ");
    		
    		
    	}
    }

public static void main(String[] args) {
			
	        Map<String, String> unsortMap = new HashMap<String, String>();
	        unsortMap.put("Z".toLowerCase(), "z");
	        unsortMap.put("B", "b");
	        unsortMap.put("A", "a");
	        unsortMap.put("C", "c");
	        
	        sortingSupport sS = new sortingSupport();
	        sS.setX(10);
	        System.out.println(sS.getX());
	        sS.sp2 = new Splitter2();
	        System.out.println(sS.sp3.x);
	        unsortMap.put("M", "m");
	        unsortMap.put("F", "f");
	        sS.sp3 = new Splitter2();
	        
	        Map<String , String > ux = new HashMap<String , String>();
	        ux.put("ccat", "hello ");
	        ux.put("B".toLowerCase(), "bb");
	        ux.put("A", "sapt");
	        ux.put("CCAT".toLowerCase(), "c");
	
	        Map<String , String> ut = new TreeMap<String , String>(ux);
	        pM(ut);
	   

	        System.out.println("\nSorted Map......By Key");
	        Map<String, String> treeMap = new TreeMap<String, String>(unsortMap);
	       // printMap(treeMap);

	    }

	    //pretty print a map
	
	}

