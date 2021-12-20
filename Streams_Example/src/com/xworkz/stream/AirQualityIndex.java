package com.xworkz.stream;

import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;
public class AirQualityIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Stream<Integer> airQualityIndex=Stream.of(34,54,66,78,44,120,243,332,27,345,223,150,12,454,234,354,124,234,66,56);
   
   List<Integer> tempAirQualityIndexstream=airQualityIndex.filter((e)->e<100).sorted((e1,e2)->e2.compareTo(e1)).collect(Collectors.toList());
   
   System.out.println( tempAirQualityIndexstream);
	}

}