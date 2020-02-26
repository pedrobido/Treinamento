package exec09;

public class Trim {
	public static void main(String[] args) {
		String um = "Olá ";
		String dois = "Mundo ";
		System.out.println("Antes dos Trim: " + um + dois + ".");
		um = um.trim();
		dois = dois.trim();
		System.out.println("Depois dos Trim: " + um + dois + ".");
	}
}
