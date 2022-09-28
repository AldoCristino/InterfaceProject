
public class Cuadrado implements Figura{

	private String nombre;
	private double lado;

	public Cuadrado(String nombre,double lado){
		this.nombre = nombre;
		this.lado = lado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return getLado()*getLado();
	}

	@Override
	public double perimetro() {
		return getLado()*4;
	}
	
	
	
}//Cuadrado
