package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class CerealsStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    double size1=5.0;
    double size2=1.6;
    double size3=1.1;
    double size4=5.9;
    double size5=4.0;
    double size6=9.9;
    double size7=8.0;
    double size8=1.3;
    double size9=4.2;
    double size10=3.4;
    Stream<Double> cerealsSize=Stream.of(size1,size2,size3,size4,size5,size6,size7,size8,size9,size10,
    		2.1,4.5,2.0,1.9,5.6,7.8,9.7,3.5,6.7,2.9);
    List<Double> tempCerealstream =cerealsSize.filter((e)->e>4).sorted().collect(Collectors.toList());
    System.out.println(tempCerealstream);
    
	}

}
