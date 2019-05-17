package aplicacaoDemo1;

import java.util.Comparator;

import entidadeDemo1.Produto;

public class MeuComparador implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		/*
		 * Agora eu tenho que comparar um produto com outro
		 * retornando um inteiro.
		 */
		return p1.getNomeProduto().toUpperCase().compareTo(p2.getNomeProduto().toUpperCase());
	}
	

}
