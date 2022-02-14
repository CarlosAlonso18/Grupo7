/*Suma de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
Suma de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
Suma de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
Suma con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor acumulado.
*/
package calculadora;

/**
 * Clase en la que se engloban todos los métodos de la suma en la calculadora
 * @see calculadora
 * @author Carlos Alonso Muñoz
 * @version 1.0.0
 * @since 30/01/2022
 *
 */
public class Suma {
	/**
	 * Se utilizará para guardar el valor de la suma en el método sumaAcumulado
	 * @see sumaAcumulado(float)
	 */
	public static float valorAcumulado;
	
	//Getters y Setters
	public float getValorAcumulado() {
		return valorAcumulado;
	}

	public void setValorAcumulado(float valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}
	
	//Métodos
	/**
	 * Suma dos números reales, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operación
	 * @param b Segundo valor de la operación
	 * @return Resultado de la suma
	 */
	public static float dosReales(float a, float b) {
		return a+b;
	}
	/**
	 * Suma dos números enteros, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operación
	 * @param b Segundo valor de la operación
	 * @return Resultado de la suma
	 */
	public static int dosEnteros(int a, int b) {
		return a+b;
	}
	/**
	 * Suma tres números reales, recibe tres valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operación
	 * @param b Segundo valor de la operación
	 * @param c Tercer valor de la operación
	 * @return Resultado de la suma
	 */
	public static float tresReales(float a, float b, float c) {
		return a+b+c;
	}
	/**
	 * Suma con un valor que se guarda en memoria y otro que recibe como argumento
	 * @param a Valor que se quiere sumar<b>(positivo)</b>
	 * @return Valor que resulta de sumar el valor acumulado al valor que se quiere sumar
	 * @see valorAcumulado
	 */
	public static float sumaAcumulado(float a) {
		valorAcumulado = a + valorAcumulado;
		return valorAcumulado;
	}
}



