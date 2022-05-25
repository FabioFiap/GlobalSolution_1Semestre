package pan.servicos.conta;

import pan.cliente.Cliente;

public class ContaCorrenteFisica extends ContaDigital {

	private String cpf;

	public ContaCorrenteFisica(Cliente cliente, String senha) {
		super(cliente, senha);
	}
}
