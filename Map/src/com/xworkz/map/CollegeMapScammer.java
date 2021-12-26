package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollegeMapScammer {

	public static void main(String[] args) {

		Map<String,Integer> nameAndStudents=new HashMap<String,Integer>();
		nameAndStudents.put("SKSVMACET",3500 );
		nameAndStudents.put("Vagdevi  P U college", 1090 );
		nameAndStudents.put("Dr Thimmareddy P U college",1203);
		nameAndStudents.put("Pes Institute", 907);
		nameAndStudents.put("J.S.S",1109 );

		Set<String> set=nameAndStudents.keySet();
        set.stream().sorted().forEach((e) -> System.out.println(e));

        System.out.println(System.lineSeparator());

        Collection<Integer> collection=nameAndStudents.values();
        collection.stream().sorted().forEach((e) -> System.out.println(e));

        System.out.println(System.lineSeparator());

        Set<Map.Entry<String, Integer>> entryset=nameAndStudents.entrySet();
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

