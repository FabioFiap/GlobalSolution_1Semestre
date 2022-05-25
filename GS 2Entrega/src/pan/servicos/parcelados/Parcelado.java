package pan.servicos.parcelados;

import pan.cliente.Cliente;
import pan.servicos.servico.Servico;

public abstract class Parcelado extends Servico {
	protected double valorTotal, valorParcelas, juros;
	protected int qntParcelas;
	protected String dataRealizacao;
	
	public Parcelado(Cliente cliente, double valorTotal, double juros, int qntParcelas) {
		super(cliente);
		this.valorTotal = valorTotal;
		this.juros = juros;
		this.qntParcelas = qntParcelas;
		
		//TODO: qntParcelas não pode ser 0
		valorParcelas = valorTotal / qntParcelas;
	}
	
}
