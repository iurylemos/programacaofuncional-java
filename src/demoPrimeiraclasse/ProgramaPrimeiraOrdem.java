package demoPrimeiraclasse;

import java.util.ArrayList;
import java.util.List;

import entidadeDemo1.Produto;

public class ProgramaPrimeiraOrdem {

	//Fun��o para comparar dois produtos
	public static int compareProdutos(Produto p1, Produto p2) {
		return p1.getValor().compareTo(p2.getValor());
	}

	public static void main(String[] args) {
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablet", 450.00));
		/* Aqui no sort que ordena a lista
		 * Eu posso passar a refer�ncia
		 * para a fun��o compareProdutos
		 * :: SINTAXE DO JAVA
		 * Aqui no Java eu posso passar para uma FUN��O
		 * que a compareProduto, para outra fun��o que � a SORT
		 * Isso � programa��o funcional
		 * Significa: Eu falar que uma fun��o ela � um objeto
		 * de primeira classe ou primeira ordem
		 * � QUE ELE PODE SER PASSADO COMO ARGUMENTO
		 * PARA OUTRAS FUN��ES, E ELE AINDA PODE SER RETORNADO
		 * COMO OUTRA FUN��O. */
		list.sort(ProgramaPrimeiraOrdem::compareProdutos);
		
		list.forEach(System.out::println);

	}

}
