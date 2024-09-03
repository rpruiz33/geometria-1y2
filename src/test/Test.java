package test;

import model.Punto;

import model.Circulo;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Punto  m = new Punto(2,3);
			Punto h =new Punto(2,1);
			Circulo c1=new Circulo(4,h);
			Circulo c2=new Circulo(4,h);
			System.out.println(m.equals1(h));
			System.out.println(m.equals(h));
			System.out.println(m.calcaularDistancia1(h));
			System.out.println(m.calcularDistancia(h));
			c1.setRadio(m);
			System.out.println(c1.calcularDistancia(c2));
			System.out.println("\narea y perimetro \n");
			System.out.println(c1.calcularArea());
			System.out.println(c2.calcularArea());
			System.out.println(c1.calcularPerimetro());
			System.out.println(c2.calcularPerimetro());
			System.out.println("\nmover circulo\n");
			c2.mover(99, 3);
			System.out.println(c2.getOrigen());
			System.out.println(c2.calcularDistanciaDeorigen(c1));
			
	}

}
