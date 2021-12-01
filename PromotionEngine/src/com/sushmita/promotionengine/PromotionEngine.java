package com.sushmita.promotionengine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PromotionEngine {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	    map.put("A",50);
	    map.put("B",30);
	    map.put("C",20);
	    map.put("D",15);
	    
	    List<String> inputSKU=new ArrayList<String>();
	    inputSKU.add("A");
	    inputSKU.add("B");
	    inputSKU.add("A");
	    inputSKU.add("B");
	    inputSKU.add("C");
	    inputSKU.add("D");
	    
	    HashMap<String, Integer> freq = new HashMap<String, Integer>();
	    Iterator<String> it = inputSKU.iterator();
	    while(it.hasNext()) {
	    	String value = it.next();
	    	freq.put(value, freq.getOrDefault(value, 0)+1);
	    }
	   PromotionImpl promotionimpl = new PromotionImpl();
	   int amountA = promotionimpl.applyPromotion3A(freq.get("A"));
	   int amountB = promotionimpl.applyPromotion2B(freq.get("B"));
	   int amountCD = promotionimpl.applyPromotionCandD(freq.get("C"),freq.get("D"));
 
	   System.out.println("Total amount: "+(amountA+amountB+amountCD));
	    
	}

}
