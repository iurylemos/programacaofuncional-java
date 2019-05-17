package entidadeDemo1;

public class Produto {
	
	private String nomeProduto;
	private Double valor;
	
	public Produto(String nomeProduto, Double valor) {
		super();
		this.nomeProduto = nomeProduto;
		this.valor = valor;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	/*
	 * Metodo est�tico ele trabalha com o Produto
	 * que voc� passar como argumento para ele.
	 * E o metodo n�o est�tico � o metodo da instancia
	 * Pega um produto e retorna um booleano.
	 */
	public static boolean staticProdutoPredicato(Produto p) {
		return p.getValor() >= 100.0;
	}
	/****************************/
	/*
	 * Como ele � um metodo n�o est�tico.
	 * Ele � um metodo que vai trabalhar com o pr�prio
	 * produto onde estou.
	 * E n�o com um Produto onde vai vim como Argumento
	 * e por isso vou apagar o parametro.
	 */
	public boolean noStaticProdutoPredicato() {
		return valor >= 100.0;
	}

	@Override
	public String toString() {
		return "Produto [nomeProduto=" + nomeProduto + ", valor=" + valor + "]";
	}

	
	
	
}
