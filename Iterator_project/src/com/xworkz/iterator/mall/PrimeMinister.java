package com.xworkz.iterator.mall;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PrimeMinister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> minister=new ArrayList<String>();
	  	minister.add("Narendra Modi");
	  	minister.add("Manmohan singh");
	  	minister.add("Atal Bhihari Vajpayee");
	  	minister.add("Inder Kumar");
	  	minister.add("H D devegowdha");
	  	minister.add("Lal Bahadur Shastri");
	  	minister.add("Jawaharlal Nehru");
	  	minister.add("Indira Gandhi");
		 
		 for(String element: minister) {
			 System.out.println(element);
		 }
		 System.out.println("*************for loop*******************");
		 
		 minister.forEach((e)->System.out.println(e));
		 System.out.println("*************for each using lambda*******************");
    
     ListIterator<String> itr=minister.listIterator();
     while(itr.hasNext()) {
   	  String element=itr.next();
   	  System.out.println(element);
     }
     System.out.println("*************listIterator*******************");
     
     ListIterator<String> itr1=minister.listIterator(minister.size());
     while(itr1.hasPrevious()) {
   	  String element1=itr1.previous();
   	  System.out.println(element1);
     }
     System.out.println(minister.size());
     System.out.println("*******************************");
     
     ListIterator<String> itr2=minister.listIterator(4);
     while(itr2.hasPrevious()) {
   	  String element2=itr2.previous();
   	  System.out.println(element2);
     }
     System.out.println("*******************************");
      
     for(int i=0;i<minister.size();i++) {
   	  String element=minister.get(i);
   	  System.out.println(element);
     }

	}

}
