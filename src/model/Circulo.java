package model;
import model.Punto;

public class Circulo {
private double radio;
private Punto origen;

public double getRadio() {
	return radio;
}

/*public void setRadio(double radio) {
	this.radio = radio;
}*/
public Punto getOrigen() {
	return origen;
}
public void setOrigen(Punto origen) {
	this.origen = origen;

}
public Circulo(double radio, Punto origen) {
	super();
	this.radio = radio;
	this.origen = origen;
}
public void setRadio(Punto radio) {
	this.radio=origen.calcularDistancia(radio);	
}

/*oreguntar si esta bien y si habria que overrroidear*/
public boolean equals(Circulo c) {
	return this.radio==c.getRadio() && this.origen==c.getOrigen();
}

@Override
public String toString() {
	return radio +""+ origen;

}

public double calcularPerimetro() {
return Math.PI*radio*2;
}

public double calcularArea() {
return Math.PI* (Math.pow(radio, 2));
}

public double calcularDistancia(Circulo c) {
	return (c.radio-this.radio);
	
}
public double calcularDistanciaDeorigen(Circulo c) {
	return Math.sqrt(Math.pow((c.getOrigen().getX()-this.origen.getX()),2) +  (Math.pow((c.getOrigen().getY()-this.origen.getY()),2)));
	
}

public void mover(double desplazamientoX, double desplazamientoY){
Punto p2=new Punto(origen.getY(), origen.getX());
	origen=p2;
	origen.mover(desplazamientoX, desplazamientoY);
	

	
}
}