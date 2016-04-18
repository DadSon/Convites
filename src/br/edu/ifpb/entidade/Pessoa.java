package br.edu.ifpb.entidade;


public class Pessoa {

	private String nome;
	private String endereco;
	private String cpf;
	private Integer codigo;
	private Integer idpessoa;
	private Integer RG;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getRG() {
		return RG;
	}

	public void setRG(Integer RG) {
		this.RG = RG;
	}

	public Integer getIdpessoa() {
		return idpessoa;
	}

	public void setIdpessoa(Integer idpessoa) {
		this.idpessoa = idpessoa;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
}