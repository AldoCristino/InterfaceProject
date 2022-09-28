
public class testFiguras {

	public static void main(String[] args) {
		
		//Creando objetos de las clases de figuras
		Triangulo t = new Triangulo("Triangulo1",20.0,10.0,15.0);
		Cuadrado c = new Cuadrado("Cuadrado",25.0);
		Rectangulo r = new Rectangulo("Rectangulo",5.0,10.0);
		Rombo rombo = new Rombo("Rombo",15.0,25,10);
		Romboide rb = new Romboide("Romboide",25,10);
		Trapecio tp = new Trapecio("Trapecio",5,3,4,2,15,10,12);
		
		//imprimiendo datos de los objetos
		imprimirCalculo(t);
		imprimirCalculo(c);
		imprimirCalculo(r);
		imprimirCalculo(rombo);
	    imprimirCalculo(rb);
	    imprimirCalculo(tp);

	}//main

	public static void imprimirCalculo(Figura f) {
		System.out.println("================");
		System.out.println(f.getNombre());
		System.out.println("El área es de: " + f.area());
		System.out.println("El perimetro es de: " +f.perimetro());
		System.out.println("================\n");
	}
	
}
