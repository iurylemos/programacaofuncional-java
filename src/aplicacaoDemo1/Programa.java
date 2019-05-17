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
		 * minha lista, que � o Produto,
		 * seja uma implementa��o do Comparable.
		 * 
		 * Retirei da classe Produto
		 * E vou utilizar o .sort 
		 * da classe list.
		 * 
		 * Abrir a leitura do Comparator<T>
		 * e l� fala que ela � uma interace Funcional
		 * Interface funcional = tem apenas um m�todo 
		 * que � ABSTRATO.
		 * 
		 * Ela pode ter tamb�m, metodos defaults e metodos est�ticos.
		 * 
		 * E o metodo que vou utilizar do Comparable
		 * � o metodo compare(T u1, T u2) e retorna String
		 */
		/************************************/
		/*
		 * Vou utilizar uma sintaxe de classe Anonima
		 * Declarar uma variavel Comparator do tipo Produto
		 * e vou chama-la de comp
		 * E dessa forma aqui eu vou poder fazer 
		 * a implementa��o de uma classe anonima
		 * entre essas chaves e utilizar 
		 * o metodo compare
		 * 
		 * Fiz uma variavel comp, que vai ser um objeto
		 * do tipo Comparator<PRODUTO>
		 * e para definir esse objeto eu criei uma classe
		 * anonima, aqui dentro mesmo da principal.
		 * E assim eu n�o preciso mais criar uma classe
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
		 * Express�o lambda, facilita mais o c�digo
		 * Definindo uma fun��o anonima tem essa sintaxe aqui
		 * do lado esquerdo voc� coloca os parametros
		 * que � o (p1,p2)
		 * -> = ArrowFuncion = FLEXA
		 * e dentro voc� coloca a implementa��o da fun��o.
		 * ESTOU FALANDO AQUI:
		 * Que o COMP vai ser uma fun��o, que ela recebe dois argumento
		 * e a implementa��o da fun��o, vai ser o que tem dentro.
		 * EX: 
		 * Comparator<Produto> comp = (p1, p2) -> {
			return p1.getNomeProduto().toUpperCase().compareTo(p2.getNomeProduto().toUpperCase());
		};
		 S� QUE PARA FICAR MAIS REDUZIDO O C�DIGO
		 PODE UTILIZAR SIMPLESMENTE SEM AS CHAVES
		 E SEM O RETURN 
		
		OU SEJA EM UMA UNICA LINHA
		EU DEFINIR O MEU compare(p1,p2) 
		
		E O MELHOR AINDA.
		N�O PRECISO NEM UTILIZAR O 
		Comparator<Produto> comp = 
		Basta eu pegar a express�o e colocar dentro do 
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
		 * Mas n�o precisou, bastou eu utilizar uma classe
		 * anonima
		 * 
		 * Ent�o dentro do meu sort
		 * eu estou colocando a minha express�o LAMBDA
		 * que � uma fun��o anonima. 
		 */
		list.sort((p1, p2) -> p1.getNomeProduto().toUpperCase().compareTo(p2.getNomeProduto().toUpperCase()));
		
		for(Produto p: list) {
			System.out.println(p);
		}

	}

}
