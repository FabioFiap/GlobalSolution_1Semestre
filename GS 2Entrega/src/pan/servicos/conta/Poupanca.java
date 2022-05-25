package pan.servicos.conta;

import pan.cliente.Cliente;

public class Poupanca extends ContaDigital {

	private double juros;
	private String dataAcrescimo;
	
	public Poupanca(Cliente cliente, String senha, String dataAcrescimo) {
		super(cliente, senha);
		this.dataAcrescimo = dataAcrescimo;
	}
	
}
