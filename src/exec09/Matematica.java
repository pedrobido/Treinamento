package exec09;

public class Matematica {
	public static void main(String[] args) {
		double x = 10, y = 20.5, z = -30;

		// Valor Absoluto
		double abs = Math.abs(z);
		System.out.println(abs);

		// Retorna o maior valor inteiro
		double ceil = Math.ceil(y);
		System.out.println(ceil);

		// Retorna o menor valor inteiro
		double floor = Math.floor(y);
		System.out.println(floor);

		// Retorna logaritmo
		double log = Math.log(x);
		System.out.println(log);

		// Retorna o maior valor inteiro entre dois números
		double max = Math.max(x, y);
		System.out.println(max);

		// Retorna o menor valor inteiro entre dois números
		double min = Math.min(x, y);
		System.out.println(min);

		// Retorna a potência de um número
		double pow = Math.pow(x, 2);
		System.out.println(pow);

		// Retorna a raiz quadrada de um número
		double sqrt = Math.sqrt(x);
		System.out.println(sqrt);

		// Retornao o coseno de um número
		double cos = Math.cos(x);
		System.out.println(cos);

		// Retornao o seno de um número
		double sin = Math.sin(x);
		System.out.println(sin);

		// Retornao a tangente de um número
		double tan = Math.tan(x);
		System.out.println(tan);
	}
}
