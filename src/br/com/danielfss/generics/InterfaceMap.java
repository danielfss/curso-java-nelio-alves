package br.com.danielfss.generics;

import java.util.Map;
import java.util.TreeMap;

public class InterfaceMap {

	/**
	 * MAP = MAPA
	 * É uma coleção de pares CHAVE / VALOR
	 * Não admite repetições do objeto chave
	 * os elementos são indexados pelo objeto chave (não possuem posição)
	 * Acesso, inserção e remoção de elementos são rápidos
	 * 
	 * Uso comum: cookies, local storage, qualquer modelo chave-valor
	 * 
	 * Principais implementações:
	 * 	HashMap - mais rápido (operações O(1) em tabela hash) e não ordenado
	 * 	TreeMap - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
	 * 	LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados.
	 * 
	 * Métodos importantes:
	 * put(key, value), remove(key), containsKey(key), get(key)
	 * 
	 * A comparação é baseada em equals e hashCode
	 * Se equals e hashCode não existir, é usada comparação de ponteiros
	 * 
	 * clear()
	 * size()
	 * 
	 * keySet() - retorna um Set<K>
	 * values() - retorna um Collection<V>
	 */
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99999-9999");
		
		cookies.remove("email");
		cookies.put("phone", "88888-8888"); // como o Map não aceita repetições de chave, ele irá sobrescrever o valor de phone

		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES: ");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
