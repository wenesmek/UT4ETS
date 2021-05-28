package figuras;

/**
 * 
 * @author Néstor Lorenzo Artiles
 * @version 0.00000001
 * @since 28-05-2021
 *
 */

public class Circunferencia {
	private double radio;
	private String color;
	
	/**
	 * 
	 * Constructor  con un parámetro para el radio de la circunferencia
	 * 
	 * @param radio El radio de la circunferencia
	 */

	public Circunferencia(double radio) {
		this.radio = radio;
	}
	
	/**
	 * Método getter para el radio de la circunferencia
	 * 
	 * @return radio 
	 */

	public double getRad() {
		return radio;
	}

	/**
	 * 
	 * Método setter para la variable radio
	 * 
	 * @param rad Medida del radio
	 */
	public void setRad(double rad) {
		this.radio = rad;
	}
	
	/**
	 * Método imprimir() Imprime en pantalla los resultados de los cálculos
	 */

	public void imprimir() {
		color = "rojo";
		System.out.println("Diámetro: " + (2 * radio));
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * radio * radio;
		System.out.println(area);
	}

//	private double calcularArea() {
//		return 2 * PI * radio * radio;
//	}
	
	/**
	 * 
	 * Método para comparar los radios de las circunferencias y designar sus diferencias
	 * 
	 * 
	 * @param considerarDecimales Boolean para saber si hay o no decimales entre los valores
	 * @param otro Otro radio a comparar con el campo radio de esta clase Circunferencia
	 * @return boolean
	 */

	public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
		double radio1 = this.radio;
		double radio2 = otro.getRad();
		if (considerarDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
