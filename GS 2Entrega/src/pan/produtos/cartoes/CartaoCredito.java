package pan.produtos.cartoes;

import pan.cliente.Cliente;

public class CartaoCredito extends Cartao {

	private double fatura, juros;
	private String dataFatura;
	
	public CartaoCredito(Cliente cliente, String senha, String dataFatura) {
		super(cliente, senha);
		this.dataFatura = dataFatura;
	}
}
