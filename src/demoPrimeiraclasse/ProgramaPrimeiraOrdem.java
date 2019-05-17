package demoPrimeiraclasse;

import java.util.ArrayList;
import java.util.List;

import entidadeDemo1.Produto;

public class ProgramaPrimeiraOrdem {

	//Função para comparar dois produtos
	public static int compareProdutos(Produto p1, Produto p2) {
		return p1.getValor().compareTo(p2.getValor());
	}

	public static void main(String[] args) {
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablet", 450.00));
		/* Aqui no sort que ordena a lista
		 * Eu posso passar a referência
		 * para a função compareProdutos
		 * :: SINTAXE DO JAVA
		 * Aqui no Java eu posso passar para uma FUNÇÃO
		 * que a compareProduto, para outra função que é a SORT
		 * Isso é programação funcional
		 * Significa: Eu falar que uma função ela é um objeto
		 * de primeira classe ou primeira ordem
		 * É QUE ELE PODE SER PASSADO COMO ARGUMENTO
		 * PARA OUTRAS FUNÇÕES, E ELE AINDA PODE SER RETORNADO
		 * COMO OUTRA FUNÇÃO. */
		list.sort(ProgramaPrimeiraOrdem::compareProdutos);
		
		list.forEach(System.out::println);

	}

}
