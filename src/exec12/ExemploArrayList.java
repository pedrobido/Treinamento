package exec12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Elemento n�1");
		arrayList.add("Elemento n�2");
		arrayList.add("Elemento n�3");

		System.out.println("Posi��o 1 cont�m:" + arrayList.get(0));
		System.out.println("Posi��o 2 cont�m:" + arrayList.get(1));
		System.out.println("Posi��o 3 cont�m:" + arrayList.get(2));

		for (String s : arrayList) {
			System.out.println("\n" + s);
		}

		arrayList.add(1, "Elemento n�1,5");
		System.out.println("\nAp�s adicionar o elemento 1,5:\n");

		for (String s : arrayList) {
			System.out.println(s);
		}

		System.out.println("\nO tamanho da lista �: " + arrayList.size());

		if (arrayList.contains("Elemento n�1,5")) {
			System.out.println("Elemento 1,5 existe");
		} else {
			System.out.println("Elemento 1,5 n�o existe");
		}

		int indice = arrayList.indexOf("Elemento n�1,5");
		System.out.println("\nO indice do elemento n�1,5 �: " + indice);

		System.out.println("\nRemovendo Elemento n�1,5");
		arrayList.remove("Elemento n�1,5");
		System.out.println("Lista Atualizada");

		for (String s : arrayList) {
			System.out.println(s);
		}

		System.out.println("\nRemovendo o ultimo elemento");
		arrayList.remove(arrayList.size() - 1);
		System.out.println("Lista Atualizada");

		for (String s : arrayList) {
			System.out.println(s);
		}

		System.out.println("\nAdicionando elementos na lista");
		arrayList.add("Elemento n�5");
		arrayList.add("Elemento n�9");
		arrayList.add("Elemento n�4");
		arrayList.add("Elemento n�0");
		arrayList.add("Elemento n�8");
		System.out.println("Lista Atualizada");

		for (String s : arrayList) {
			System.out.println(s);
		}

		System.out.println("\nLista Ordenada");
		Collections.sort(arrayList);
		for (String s : arrayList) {
			System.out.println(s);
		}

		List<Filme> arrayListFilme = new ArrayList<Filme>();
		Filme filme1 = new Filme();
		filme1.setCodigo(1);
		filme1.setNome("O Iluminado");
		Filme filme2 = new Filme();
		filme2.setCodigo(2);
		filme2.setNome("2001: Uma Odiss�ia no Espa�o");
		Filme filme3 = new Filme();
		filme3.setCodigo(3);
		filme3.setNome("Laranja Mec�nica");

		if (filme1.equals(filme2)) {
			System.out.println("\nFilmes iguais");
		} else {
			System.out.println("\nFilmes diferentes");
		}

		arrayListFilme.add(filme1);
		arrayListFilme.add(filme2);
		arrayListFilme.add(filme3);

		for (Filme filme : arrayListFilme) {
			System.out.println(filme);
		}

//		Collections.sort(arrayListFilme);
//		for (Filme filme : arrayListFilme) {
//			System.out.println(filme);
//		}
		
		
	}

}
