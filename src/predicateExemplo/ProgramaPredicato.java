package predicateExemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entidadeDemo1.Produto;

public class ProgramaPredicato {

	public static void main(String[] args) {
		
		List<Produto> list = new ArrayList<>();
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		//Remover dessa lista quem atende ao Predicate
		/*
		p tal que -> p.getPreco for maior igual a 100
		list.removeIf(p -> p.getValor() >= 100);
		 */
		
		//Colocando o predicate manualmente.
		/*
		 * Vou colocar uma classe que vai utilizar
		 * a interface Predicate<T> 
		 */
		
		//Estático: list.removeIf(Produto::staticProdutoPredicato);
		/********************************/
		//Não estático: list.removeIf(Produto::noStaticProdutoPredicato);
		/*
		 * Isso daqui acima é o que chamamos de
		 * Method Referencer
		 * Referencia para metodos
		 * Eu coloco o nome da classe onde o metodo está
		 * e boto o nome da classe dois pontos,
		 * e o nome do metodo.
		 * 
		 */
		/***********************************/
		/*
		 * Agora com EXPRESSÃO LAMBDA
		 * a partir da interface Predicate
		 * E o melhor é que eu posso pegar um resultado
		 * que o usuário digitar e apartir do que ele digitar
		 * eu posso dizer qual o valor minimo entre os produtos.
		 */
		
		double min = 100.0;
		
		//Predicate<Produto> pred = p -> p.getValor() >= min;
		list.removeIf(p -> p.getValor() >= min);
		
		
		/**************************************/
		for(Produto p: list) {
			System.out.println(p);
		}

	}

}
