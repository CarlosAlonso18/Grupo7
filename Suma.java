/*Suma de dos n?meros reales, tendr? 2 par?metros de entrada y uno de salida que ser? la soluci?n.
Suma de dos n?meros enteros, tendr? 2 par?metros de entrada y uno de salida que ser? la soluci?n.
Suma de tres n?meros reales, tendr? 3 par?metros de entrada y uno de salida que ser? la soluci?n.
Suma con valor acumulado, tendr? un par?metro de entrada y la clase deber? de guardar el valor acumulado.
*/
package calculadora;

/**
 * Clase en la que se engloban todos los m?todos de la suma en la calculadora
 * @see calculadora
 * @author Carlos Alonso Mu?oz
 * @version 1.0.0
 * @since 30/01/2022
 *
 */
public class Suma {
	/**
	 * Se utilizar? para guardar el valor de la suma en el m?todo sumaAcumulado
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
	
	//M?todos
	/**
	 * Suma dos n?meros reales, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operaci?n
	 * @param b Segundo valor de la operaci?n
	 * @return Resultado de la suma
	 */
	public static float dosReales(float a, float b) {
		return a+b;
	}
	/**
	 * Suma dos n?meros enteros, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operaci?n
	 * @param b Segundo valor de la operaci?n
	 * @return Resultado de la suma
	 */
	public static int dosEnteros(int a, int b) {
		return a+b;
	}
	/**
	 * Suma tres n?meros reales, recibe tres valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operaci?n
	 * @param b Segundo valor de la operaci?n
	 * @param c Tercer valor de la operaci?n
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



