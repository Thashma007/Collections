package com.xworkz.collect.starter;

import com.xworkz.collections.daos.TrainNoDAO;

import com.xworkz.collections.daos.EndsWithMatches;
import com.xworkz.collections.daos.EqualsIgnoreCase;
import com.xworkz.collections.daos.EqualsSearch;
import com.xworkz.collections.daos.StartsWithMatch;
import com.xworkz.collections.daos.StringMatch;


public class TrainNoStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        TrainNoDAO cigDAO=new TrainNoDAO();

		StringMatch stringMatch=new EqualsSearch();
		boolean result=cigDAO.find(stringMatch, "T3421986");
		System.out.println(result);


		StringMatch stringMatch1=new EqualsIgnoreCase();
		boolean result1=cigDAO.find(stringMatch1, "e3672345");
		System.out.println(result1);

		StringMatch stringMatch2=new StartsWithMatch();
		boolean result2=cigDAO.find(stringMatch2, "67");
		System.out.println(result2);


		StringMatch stringMatch3=new EndsWithMatches();
		boolean result3=cigDAO.find(stringMatch3, "32");
		System.out.println(result3);



	}

}
