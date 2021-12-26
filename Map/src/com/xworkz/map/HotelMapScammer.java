package com.xworkz.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HotelMapScammer {

	public static void main(String[] args) {

		Map<String,Integer> nameAndMembers=new HashMap<String,Integer>();
		nameAndMembers.put("Gokul Hotel",35 );
		nameAndMembers.put("Udapi Hotel", 40 );
		nameAndMembers.put("Swasthik Hotel",53);
		nameAndMembers.put("Brundavan", 38);
		nameAndMembers.put("Kadamba Hotel",44 );

		Set<String> set=nameAndMembers.keySet();
        set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

        System.out.println(System.lineSeparator());

        Collection<Integer> collection=nameAndMembers.values();
        collection.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

        System.out.println(System.lineSeparator());

        Set<Map.Entry<String, Integer>> entryset=nameAndMembers.entrySet();
        Iterator<Map.Entry<String,Integer>> itr=entryset.iterator();
        while(itr.hasNext())
        {
        	Map.Entry<String,Integer> element =itr.next();
        	System.out.println(element.getKey()+ " ".concat("contains")+" ".concat(element.getValue()+" ".concat("members")));

        	System.out.println(System.lineSeparator());

			entryset.forEach((entry) -> System.out.println(entry.getKey() . concat(" has ") + " " .concat(String.valueOf(entry.getValue()))));
        }

	}

}

