package com.xworkz.map;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MobileMapScammer {

	public static void main(String[] args) {

		Map<String,String> mobileNoAndName=new HashMap<String,String>();
		mobileNoAndName.put("8050058473", "Anusha");
		mobileNoAndName.put("7204735375", "Rajeshwari");
		mobileNoAndName.put("9483764433", "Veeresh");
		mobileNoAndName.put("9483764424", "Shaila");
		mobileNoAndName.put("9480674362", "Mahesh");

		Set<String> set=mobileNoAndName.keySet();
		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));;

		System.out.println(System.lineSeparator());

		Collection<String> collection=mobileNoAndName.values();
		collection.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println(System.lineSeparator());

		Set<Map.Entry<String,String>> entryset=mobileNoAndName.entrySet();
		Iterator<Map.Entry<String,String>> itr=entryset.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,String> element=itr.next();
			System.out.println(element.getKey() . concat( " is Mobile number of ") + " " .concat(element.getValue()));

			System.out.println(System.lineSeparator());

			entryset.forEach((entry) -> System.out.println(entry.getKey() . concat(" is Mobile number of") + " " .concat(entry.getValue())));
		}

	}

}

