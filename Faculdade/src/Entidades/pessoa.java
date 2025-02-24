package Entidades;

public abstract class pessoa {
	private String nome;
	private String email;
	private int idade;
	private String cpf;
	private char sexo;
	private String senha;

	public pessoa() {

	}

	public pessoa(String nome, String email, int idade, String cpf, char sexo, String senha) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.cpf = cpf;
		this.sexo = sexo;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
