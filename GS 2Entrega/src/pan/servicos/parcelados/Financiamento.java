package pan.servicos.parcelados;

import pan.cliente.Cliente;

public class Financiamento extends Parcelado {

	private String dataFim;
	private double entrada;
	
	public Financiamento(Cliente cliente, double valorTotal, double juros, int qntParcelas, double entrada) {
		super(cliente, valorTotal, juros, qntParcelas);
		this.entrada = entrada;
	}
}
