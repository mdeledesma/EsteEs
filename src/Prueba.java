
public class Prueba {


	static int sumar(int a, int b)
	{
		return a + b;
	}
	
	static int multiplicar(int a, int b)
	{
		return a*b;
	}
	
	static void mostrarResultado (int a)
	{
		System.out.println("El resultado es " + a);
	}

	public static void main(String[] args) {
		sumar(5,2);
		multiplicar(5, 3);
		mostrarResultado(multiplicar(7, 2));
	}


}
