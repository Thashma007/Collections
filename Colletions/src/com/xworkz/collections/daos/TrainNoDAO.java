package com.xworkz.collections.daos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class TrainNoDAO {

	private Collection<String> beerdaos=new ArrayList<String>();

 	public TrainNoDAO()
 	{
 		this.beerdaos.add("T3421986");
 		this.beerdaos.add("B342G314");
 		this.beerdaos.add("E3672345");
 		this.beerdaos.add("6754A432");



 	}
  public boolean find(StringMatch search,String value)
  {
 	 Iterator<String> itr=beerdaos.iterator();
 	 while(itr.hasNext())
 	 {
 	String element=(String)itr.next();
 	if(search.evaluate(element,value))
 	{
 		return true;
 	}


 	 }
 	 return false;
  }
}
