package pan.servicos.parcelados;

import pan.cliente.Cliente;

public class Emprestimo extends Parcelado {

	private String prazo;

	public Emprestimo(Cliente cliente, double valorTotal, double juros, int qntParcelas, String prazo) {
		super(cliente, valorTotal, juros, qntParcelas);
		this.prazo = prazo;
	}
}
