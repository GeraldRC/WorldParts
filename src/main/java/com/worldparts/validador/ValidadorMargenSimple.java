package com.worldparts.validador;

public class ValidadorMargenSimple implements ValidadorMargen {

	private double precio;
	private double costo;

	public ValidadorMargenSimple() {
		super();
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	@Override
	public String validar(Double precio, Double costo) {
		
		String respuesta = "";
		
		double margen = (precio - costo) / precio;
		
		if(margen >= 0.10) {
			respuesta = "MARGEN OK";
		}else {
			respuesta = "ALERTA, MARGEN BAJO MINIMO";
		}
		
		return respuesta;
	}

}
