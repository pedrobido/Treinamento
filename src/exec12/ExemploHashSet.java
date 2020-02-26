package exec12;

import java.util.HashSet;

public class ExemploHashSet {
	public static void main(String[] args) {

		HashSet<String> lista = new HashSet<String>();
		lista.add("A Era do Gelo");
		lista.add("Madagascar");
		lista.add("Fuga das Galinhas");
		
		System.out.println(lista);
		
		HashSet<Integer> listaInt = new HashSet<Integer>();
		listaInt.add(0);
		listaInt.add(1);
		listaInt.add(1);
		listaInt.add(2);
		listaInt.add(3);
		listaInt.add(4);
		System.out.println(listaInt);

	}
}
