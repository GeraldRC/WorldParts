package com.worldparts.validador;

public class ValidadorMargenComplejo implements ValidadorMargen {

	private double precio;
	private double costo;

	public ValidadorMargenComplejo() {
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

		 if (margen < 0.10 && margen > 0.0) {
			respuesta = "ALERTA, MARGEN BAJO MINIMO";

		} else if (margen > 1 && precio >= 1000) {
			respuesta = "ADVERTENCIA, POSIBLE ERROR EN COSTO";

		} else if (margen < 0) {
			respuesta = "ADVERTENCIA, MARGEN NEGATIVO";

		} else if (margen >= 0.5 && precio < 1000) {
			respuesta = "ADVERTENCIA, POSIBLE ERROR EN COSTO";
		}else {
			respuesta= "MARGEN OK";
		}
		 
		return respuesta; 
	}

}
