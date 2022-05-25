package pan.produtos.maquininha;

import pan.cliente.Cliente;
import pan.produtos.produto.Produto;

public class Maquininha extends Produto {

	private double taxa, vendasTotais, vendasMensais;
	
	public Maquininha(Cliente cliente) {
		super(cliente);
	}
}
