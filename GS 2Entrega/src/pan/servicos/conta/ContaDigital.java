package pan.servicos.conta;

import pan.cliente.Cliente;
import pan.servicos.servico.Servico;

public abstract class ContaDigital extends Servico {

	protected String numero, senha, dataCriacao, status;
	protected double saldo;
	
	public ContaDigital(Cliente cliente, String senha) {
		super(cliente);
		this.senha = senha;
	}
	
}
