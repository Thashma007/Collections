package com.xworkz.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryMapScammer {

	public static void main(String[] args) {

		Map<String,String> countryAndState=new HashMap<String,String>();
		countryAndState.put("India", "Karnataka");
		countryAndState.put("America", "California");
		countryAndState.put("Africa", "Algeria");
		countryAndState.put("England", "London");
		countryAndState.put("Austrila", "Victoria");

		Set<String> set=countryAndState.keySet();
		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));;

		System.out.println(System.lineSeparator());

		Collection<String> collection=countryAndState.values();
		collection.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println(System.lineSeparator());

		Set<Map.Entry<String,String>> entryset=countryAndState.entrySet();
		Iterator<Map.Entry<String,String>> itr=entryset.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,String> element=itr.next();
			System.out.println(element.getKey() . concat(" has ") + " " .concat(element.getValue())+ " " . concat("state"));

			System.out.println(System.lineSeparator());

			entryset.forEach((entry) -> System.out.println(entry.getKey() . concat(" has ") + " " .concat(entry.getValue())));
		}
	}

}


