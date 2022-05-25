package pan.servicos.servico;

import pan.cliente.Cliente;

public abstract class Servico {

	protected Cliente cliente;

	public Servico(Cliente cliente) {
		this.cliente = cliente;
	}
}
