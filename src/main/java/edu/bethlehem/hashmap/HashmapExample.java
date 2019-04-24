package edu.bethlehem.hashmap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;



public class HashmapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> word2Freq = new HashMap<>();
		word2Freq.put("hello", 2);
		
		word2Freq.put("aiao", 22);
		word2Freq.put("eiao", 22);
		word2Freq.put("ciao", 22);
		word2Freq.put("hi", 12);
		
		Set<Entry<String, Integer>> entrySet = word2Freq.entrySet();
		List<Entry<String, Integer>> entriesColl = new ArrayList<>();
		for (Entry<String, Integer> entry : entrySet) {
			entriesColl.add(entry);
		}
		//List<Entry<String, Integer>> entriesColl = word2Freq.entrySet().stream().collect(Collectors.toList());
	
		Comparator<Entry<String, Integer>> comparator = new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if (o1.getValue() < o2.getValue())
					return +1;
				if (o1.getValue() > o2.getValue())
					return -1;
				return o1.getKey().compareTo(o2.getKey());
			}
		};
		
		//List<Entry<String, Integer>> collect = word2Freq.entrySet().stream().sorted(comparator).collect(Collectors.toList());
		java.util.Collections.sort(entriesColl, comparator);
		System.out.println(entriesColl.toString());
		//System.out.println(collect.toString());
	}

}
