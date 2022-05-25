package pan.servicos.pix;

import pan.cliente.Cliente;
import pan.servicos.servico.Servico;

public class Pix extends Servico {

	private String[] chave;
	private double limite;
	public Pix(Cliente cliente) {
		super(cliente);
	}
}
