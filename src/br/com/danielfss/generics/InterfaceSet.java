package br.com.danielfss.generics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class InterfaceSet {

	/**
	 * SET = CONJUNTO
	 * Representa um conjunto de elementos (similar ao da Álgebra)
	 * Não admite elementos REPETIDOS.
	 * Elementos não possuem posição
	 * Acesso, inserção e remoção de elementos são rápidos.
	 * Oferece operações eficientes de conjunto: inserseção, união e diferença.
	 * Principais implementações:
	 * HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
	 * TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
	 * LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados.
	 * 
	 * Métodos importantes da interface SET
	 * add(obj), remove(obj), contains(obj)
	 * 		Baseado em equals e hashcode
	 * 		Se equal e hashcode não existir, é usada comparação de ponteiros
	 * clear()
	 * size()
	 * removeIf(predicate) // remove todos elementos que atenderem o predicado
	 * 
	 * addAll(other) - união: adiciona no conjunto os elementos do outro conjunto, sem repetição
	 * retainAll(other) - interseção: remove do conjunto os elementos não contidos em other
	 * removeAll(other) - diferença: remove do conjunto os elementos contidos em other
	 */
	public static void main(String[] args) {
		// EXEMPLO HashSet
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("Tv");
		hashSet.add("Notebook");
		hashSet.add("Tablet");
		
		System.out.println("HashSet");
		System.out.println(hashSet.contains("Notebook"));
		
		for (String p : hashSet) {
			System.out.println(p);
		}
		System.out.println("-------------------\n");
		
		// EXEMPLO TreeSet
		Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("Tv");
		treeSet.add("Notebook");
		treeSet.add("Tablet");
		
		System.out.println("TreeSet");
		System.out.println(treeSet.contains("Notebook"));
		
		for (String p : treeSet) {
			System.out.println(p);
		}
		System.out.println("-------------------\n");
		
		// EXEMPLO LinkedHashSet
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("Tv");
		linkedHashSet.add("Notebook");
		linkedHashSet.add("Tablet");
		
		System.out.println("LinkedHashSet");
		linkedHashSet.remove("Tablet");
		linkedHashSet.removeIf(item -> item.length() >= 3);
		linkedHashSet.removeIf(item -> item.charAt(0) == 'T');
		System.out.println(linkedHashSet.contains("Notebook"));
		
		for (String p : linkedHashSet) {
			System.out.println(p);
		}
		System.out.println("-------------------\n");
		
		Set<Integer> a = new TreeSet<Integer>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<Integer>(Arrays.asList(5,6,7,8,9,10));
		
		// union
		Set<Integer> c = new TreeSet<Integer>(a);
		c.addAll(b);
		System.out.println(c);
		
		// intersection
		Set<Integer> d = new TreeSet<Integer>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// difference
		Set<Integer> e = new TreeSet<Integer>(a);
		e.removeAll(b);
		System.out.println(e);
		
	}
}
