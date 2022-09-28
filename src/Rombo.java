
public class Rombo implements Figura{

	private String nombre;
	private double lado;
	private double diagMay;
	private double diagMen;
	public Rombo(String nombre, double lado, double diagMay, double diagMen) {
		super();
		this.nombre = nombre;
		this.lado = lado;
		this.diagMay = diagMay;
		this.diagMen = diagMen;
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
	public double getDiagMay() {
		return diagMay;
	}
	public void setDiagMay(double diagMay) {
		this.diagMay = diagMay;
	}
	public double getDiagMen() {
		return diagMen;
	}
	public void setDiagMen(double diagMen) {
		this.diagMen = diagMen;
	}
	@Override
	public double perimetro() {
		return getLado()*4;
	}
	@Override
	public double area() {
		return (getDiagMay()*getDiagMen())/2;
	}
	
	
	
}
