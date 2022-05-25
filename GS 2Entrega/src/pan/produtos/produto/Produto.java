package pan.produtos.produto;

import pan.cliente.Cliente;

public abstract class Produto {

	protected Cliente cliente;

	public Produto(Cliente cliente) {
		this.cliente = cliente;
	}
}
