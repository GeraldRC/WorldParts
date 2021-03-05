package com.worldparts.validador;


public class DemoConsola {
	
	public static void main(String[] args) {
		
		ValidadorMargenSimple validadorSimple = new ValidadorMargenSimple();
		ValidadorMargenComplejo validadorComplejo = new ValidadorMargenComplejo();
		
		 
		System.err.println("----------------------------------------------");
		System.err.println("||DEMOSTRACION ALGORITMO VERIFICACION MARGEN||");
		System.err.println("----------------------------------------------");
			 
		for (int i = 0; i < 5; i++) {
			 
			 //Generacion de precio y costo entre 200 y 2000
			 double precio = 200 + (Math.random() * 2000);  
			 double costo = 200 +  (Math.random() * 2000);
			 
			 System.out.println(""+(i+1)+" Precio:"+precio+"  Costo:"+costo+" ");
			 System.out.println("ALGORITMO SIMPLE: " +validadorSimple.validar(precio, costo));
			 System.out.println("ALGORITMO COMPLEJO: " +validadorComplejo.validar(precio, costo));
			 System.out.println(" ");
		}
		
		
		
	}

}
