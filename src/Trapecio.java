
public class Trapecio implements Figura{

	private String nombre;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double baseMay;
	private double baseMen;
	private double altura;
	public Trapecio(String nombre, double lado1, double lado2, double lado3, double lado4, double baseMay,
			double baseMen, double altura) {
		super();
		this.nombre = nombre;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.baseMay = baseMay;
		this.baseMen = baseMen;
		this.altura = altura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	public double getLado4() {
		return lado4;
	}
	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}
	public double getBaseMay() {
		return baseMay;
	}
	public void setBaseMay(double baseMay) {
		this.baseMay = baseMay;
	}
	public double getBaseMen() {
		return baseMen;
	}
	public void setBaseMen(double baseMen) {
		this.baseMen = baseMen;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double area() {
		
		return (getAltura()*(getBaseMay()+getBaseMen()))/2;
	}
	@Override
	public double perimetro() {
		return getLado1()+getLado2()+getLado3()+getLado4();
	}
	
	
	
	
}
