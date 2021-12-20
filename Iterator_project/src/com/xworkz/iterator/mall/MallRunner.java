package com.xworkz.iterator.mall;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MallRunner {
  public static void main (String[] args ) {
	  
	  	 List<String> mall=new ArrayList<String>();
	  	 mall.add("Orion mall");
		 mall.add("Gopalan mall");
		 mall.add("Phoenix");
		 mall.add("UB city mall");
		 mall.add("Mall of mysore");
		 mall.add("Elegance mantri mall");
		 
		 for(String element: mall) {
			 System.out.println(element);
		 }
		 System.out.println("*************for loop*******************");
		 
		 mall.forEach((e)->System.out.println(e));
		 System.out.println("*************for each using lambda*******************");
     
      ListIterator<String> itr=mall.listIterator();
      while(itr.hasNext()) {
    	  String element=itr.next();
    	  System.out.println(element);
      }
      System.out.println("*************listIterator*******************");
      
      ListIterator<String> itr1=mall.listIterator(mall.size());
      while(itr1.hasPrevious()) {
    	  String element1=itr1.previous();
    	  System.out.println(element1);
      }
      System.out.println(mall.size());
      System.out.println("*******************************");
      
      ListIterator<String> itr2=mall.listIterator(4);
      while(itr2.hasPrevious()) {
    	  String element2=itr2.previous();
    	  System.out.println(element2);
      }
      System.out.println("*******************************");
       
      for(int i=0;i<mall.size();i++) {
    	  String element=mall.get(i);
    	  System.out.println(element);
      }
  }
  }
