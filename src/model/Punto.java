package model;

import java.util.Objects;

public class Punto {
	private double x;
	private double y;

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString(){
		return "("+x+","+y+")";

	}




	/*PREGUNTAR PORQUE O SI ESTARIA MAL HACER DE ESTA FORMA*/
	public boolean equals1(Punto z) {
		return(z.x==x && z.y==y);
	}



	public boolean equals(Punto p){
		return ((x==p.getX())&&(y==p.getY()));
	}

	/*PREGUNTAR PORQUE O SI ESTARIA MAL HACER DE ESTA FORMA*/
	public double calcaularDistancia1(Punto p) {	
		return Math.sqrt(Math.pow((p.x-x),2) +   (Math.pow((p.y-y),2)));	
	}


	public double calcularDistancia(Punto punto) {
		return Math.sqrt(Math.pow((punto.x - this.x),2) + (Math.pow((punto.y - this.y),2)));
	}

	public void mover(double desplazamientoX, double desplazamientoY){
		x = x + desplazamientoX;
		y = y + desplazamientoY;
	}


}
