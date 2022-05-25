package pan.produtos.cartoes;

import pan.cliente.Cliente;
import pan.produtos.produto.Produto;

public abstract class Cartao extends Produto {

	protected String numero, validade, cvv, senha;
	protected double limite;
	
	public Cartao(Cliente cliente, String senha) {
		super(cliente);
		this.senha = senha;
	}
}
