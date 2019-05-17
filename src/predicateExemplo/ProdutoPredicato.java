package predicateExemplo;

import java.util.function.Predicate;

import entidadeDemo1.Produto;

public class ProdutoPredicato implements Predicate<Produto> {

	@Override
	public boolean test(Produto p) {
		return p.getValor() >= 100.0;
	}
	
}
