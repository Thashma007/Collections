package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class SpecsStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> specsNames=Stream.of("Ray-Ban","Oakley","Carrera","Fastrack","Polaroid","Farenheit","Armani Exchange","IDEE",
				"Vouge"," Burberry"," Police","Flying Machine","Prada"," Gucci"," Calvin Klein"," Lacoste",
				"Esprit","Scott"," Versace","Fossil");
		//List<String> tempSpecsstream=specsNames.sorted().map(String::toLowerCase).collect(Collectors.toList());
		
		//System.out.println(tempSpecsstream);
		
		//Upper Case
       List<String> tempSpecsUpperstream=specsNames.sorted().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(tempSpecsUpperstream);
		}
		
	}

