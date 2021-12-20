package com.xworkz.iterator.mall;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class MlaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
	  	 set.add("K Venkatesh");
	  	 set.add("A Manju");
	  	 set.add("Srinivas");
	  	 set.add("Siddu Savadi");
	  	 set.add("S Suresh");
	  	 set.add("Nagesh");
	  	 set.add("Shankar");
		 for(String element:set) {
			 System.out.println(element);
		 }
		 System.out.println("******************************");
		 
		 set.forEach((e)->System.out.println(e));
		 System.out.println("******************************");
		 
		 Iterator<String> itr=set.iterator();
		 while(itr.hasNext()) {
			 String element=itr.next();
			 System.out.println(element);
		 }
		 
	}
}

