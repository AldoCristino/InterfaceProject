
public class Rectangulo implements Figura{
	private String nombre;
	private double base;
	private double altura;
	public Rectangulo(String nombre, double base, double altura) {
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double area() {
		return getAltura() * getBase();
	}
	@Override
	public double perimetro() {
		return (getAltura()*2) +(getBase()*2);
	}
}
