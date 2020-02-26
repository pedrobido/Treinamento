package exec12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Elemento nº1");
		arrayList.add("Elemento nº2");
		arrayList.add("Elemento nº3");

		System.out.println("Posição 1 contém:" + arrayList.get(0));
		System.out.println("Posição 2 contém:" + arrayList.get(1));
		System.out.println("Posição 3 contém:" + arrayList.get(2));

		for (String s : arrayList) {
			System.out.println("\n" + s);
		}

		arrayList.add(1, "Elemento nº1,5");
		System.out.println("\nApós adicionar o elemento 1,5:\n");

		for (String s : arrayList) {
			System.out.println(s);
		}

		System.out.println("\nO tamanho da lista é: " + arrayList.size());

		if (arrayList.contains("Elemento nº1,5")) {
			System.out.println("Elemento 1,5 existe");
		} else {
			System.out.println("Elemento 1,5 não existe");
		}

		int indice = arrayList.indexOf("Elemento nº1,5");
		System.out.println("\nO indice do elemento nº1,5 é: " + indice);

		System.out.println("\nRemovendo Elemento nº1,5");
		arrayList.remove("Elemento nº1,5");
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
		arrayList.add("Elemento nº5");
		arrayList.add("Elemento nº9");
		arrayList.add("Elemento nº4");
		arrayList.add("Elemento nº0");
		arrayList.add("Elemento nº8");
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
		filme2.setNome("2001: Uma Odisséia no Espaço");
		Filme filme3 = new Filme();
		filme3.setCodigo(3);
		filme3.setNome("Laranja Mecânica");

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
