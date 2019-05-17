package aplicacaoDemo1;

import java.util.ArrayList;
import java.util.List;

import entidadeDemo1.Produto;

public class Programa {

	public static void main(String[] args) {

		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablet", 450.00));
		/*
		 * Mandando ordenar com o Collection.sort
		 * mas para isso ele precisa que o tipo da 
		 * minha lista, que é o Produto,
		 * seja uma implementação do Comparable.
		 * 
		 * Retirei da classe Produto
		 * E vou utilizar o .sort 
		 * da classe list.
		 * 
		 * Abrir a leitura do Comparator<T>
		 * e lá fala que ela é uma interace Funcional
		 * Interface funcional = tem apenas um método 
		 * que é ABSTRATO.
		 * 
		 * Ela pode ter também, metodos defaults e metodos estáticos.
		 * 
		 * E o metodo que vou utilizar do Comparable
		 * é o metodo compare(T u1, T u2) e retorna String
		 */
		/************************************/
		/*
		 * Vou utilizar uma sintaxe de classe Anonima
		 * Declarar uma variavel Comparator do tipo Produto
		 * e vou chama-la de comp
		 * E dessa forma aqui eu vou poder fazer 
		 * a implementação de uma classe anonima
		 * entre essas chaves e utilizar 
		 * o metodo compare
		 * 
		 * Fiz uma variavel comp, que vai ser um objeto
		 * do tipo Comparator<PRODUTO>
		 * e para definir esse objeto eu criei uma classe
		 * anonima, aqui dentro mesmo da principal.
		 * E assim eu não preciso mais criar uma classe
		 * separada implementando a interface para depois
		 * chamar ela aqui.
		 * Basta eu fazer assim.
		 */
		/*Comparator<Produto> comp = new Comparator<Produto>() {

			@Override
			public int compare(Produto p1, Produto p2) {
			
				return p1.getNomeProduto().toUpperCase().compareTo(p2.getNomeProduto().toUpperCase());
			}
			
		};
		/******************************************/
		/*
		 * Expressão lambda, facilita mais o código
		 * Definindo uma função anonima tem essa sintaxe aqui
		 * do lado esquerdo você coloca os parametros
		 * que é o (p1,p2)
		 * -> = ArrowFuncion = FLEXA
		 * e dentro você coloca a implementação da função.
		 * ESTOU FALANDO AQUI:
		 * Que o COMP vai ser uma função, que ela recebe dois argumento
		 * e a implementação da função, vai ser o que tem dentro.
		 * EX: 
		 * Comparator<Produto> comp = (p1, p2) -> {
			return p1.getNomeProduto().toUpperCase().compareTo(p2.getNomeProduto().toUpperCase());
		};
		 SÓ QUE PARA FICAR MAIS REDUZIDO O CÓDIGO
		 PODE UTILIZAR SIMPLESMENTE SEM AS CHAVES
		 E SEM O RETURN 
		
		OU SEJA EM UMA UNICA LINHA
		EU DEFINIR O MEU compare(p1,p2) 
		
		E O MELHOR AINDA.
		NÃO PRECISO NEM UTILIZAR O 
		Comparator<Produto> comp = 
		Basta eu pegar a expressão e colocar dentro do 
		sort() '-'
		
		 * 
		 */
		//Comparator<Produto> comp = (p1, p2) -> p1.getNomeProduto().toUpperCase().compareTo(p2.getNomeProduto().toUpperCase());
		
		/******************************************/
		
		//Collections.sort(list);
		/*
		 * Criei essa classe auxiliar
		 * que compara um produto com outro.
		 * E como ele retornou pelo nome
		 * Ele foi organizado pelo NOME
		 * com o sort.
		 * 
		 * Mas não precisou, bastou eu utilizar uma classe
		 * anonima
		 * 
		 * Então dentro do meu sort
		 * eu estou colocando a minha expressão LAMBDA
		 * que é uma função anonima. 
		 */
		list.sort((p1, p2) -> p1.getNomeProduto().toUpperCase().compareTo(p2.getNomeProduto().toUpperCase()));
		
		for(Produto p: list) {
			System.out.println(p);
		}

	}

}
