package javaexplorer.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Esta classe tem a finalidade de explorar
 * particularidades no uso de coleções na linguagem
 * Como: List / Set / Queue / Map
 */
public class CollectionExplorer {
	//Todo o nosso cenário será com base na nossa School
	public static void main(String[] args) {
		trabalhandoComColecao();
	}
	static void trabalhandoComColecao() {
		/*
		 * Vamos imaginar que iniciou a fase de inscrição pelo site da MJV
		 */
		
		//PESQUISA A DIFERENÇA ENTRE
		//ArrayList e Vector
		
		List<String> inscritos = new ArrayList();
		inscritos.add("RENATO GONÇALVES");
		inscritos.add("AURI MARTINS");
		inscritos.add("DAVY LUCAS");
		inscritos.add("PRISCILA PASSOS");
		inscritos.add("DIEGO CARDOSO");
		
		//renato por segurança se cadastrou novamente
		inscritos.add("RENATO GONÇALVES");
		
		//A Nicole foi e pediu para o time de TI a Lista de inscritos
		imprimirColecao(inscritos);
		
		//A Nicole se deparou com problemas
		//1 A Lista não está "classificada"
		//Isso é um trabalho para a classe utilitária Collections
		Collections.sort(inscritos);
		System.out.println("\nImprimindo a lista ordenada\n");
		imprimirColecao(inscritos);
		
		//2 o cadastro de renato está duplicado
		/*
		 * esse desenvolvedor back não imaginou que alguém 
		 * poderia se cadastrar mais de uma vez
		 * para fazer alguma validação
		 * mas a linguagem por ela ser TOP DAS GALAXIAS tem um solução
		 * SET Power. 
		 */
		setPower(inscritos);
		
	}
	static void setPower(List<String> inscritos) {
		//pesquisa sobre HashSet e TreeSet
		Set<String> inscritosArrumado = new TreeSet();
		for(String inscrito: inscritos) {
			
			boolean adicionei = inscritosArrumado.add(inscrito);
			String adicionou = adicionei?"Adicionei": "NÃO Adicionei";
			System.out.println(adicionou + " o inscrito " + inscrito);
		}
		System.out.println("\nimprimindo os inscritos sem repetição\n");
		imprimirColecao(inscritosArrumado);
		
		
	}
	static void imprimirColecao(Collection colecao) {
		for(Object itemColecao: colecao) {
			System.out.println(itemColecao);
		}
	}
}
