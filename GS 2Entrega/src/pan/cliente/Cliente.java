package pan.cliente;

import pan.servicos.*;
import pan.servicos.conta.ContaDigital;
import pan.servicos.servico.Servico;
import pan.produtos.*;
import pan.produtos.produto.Produto;

public class Cliente {

	private String cpf, nome, sexo, email, telefone, endereco;
	private ContaDigital conta;
	private Servico[] servicos;
	private Produto[] produtos;
	
	public Cliente(String cpf, String nome, String sexo, String email, String telefone, String endereco, 
			ContaDigital conta) {
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.conta = conta;
	}
	
	
}
