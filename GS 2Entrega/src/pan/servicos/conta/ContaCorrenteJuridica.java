package pan.servicos.conta;

import pan.cliente.Cliente;

public class ContaCorrenteJuridica extends ContaDigital {

	private String cnpj;

	public ContaCorrenteJuridica(Cliente cliente, String senha, String cnpj) {
		super(cliente, senha);
		this.cnpj = cnpj;
	}
}
