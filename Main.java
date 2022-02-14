package calculadora;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Suma.dosReales(2.7F, 5));
		System.out.println(Suma.dosEnteros(2, 5));
		System.out.println(Suma.tresReales(2, 5, 7));
		
		
		for (int i = 0;i<10;i++) {
			System.out.println("Acumulado: "+Suma.sumaAcumulado(i));
		}
		
		

	}

}
