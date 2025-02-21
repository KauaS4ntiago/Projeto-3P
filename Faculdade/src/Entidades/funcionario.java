package Entidades;

import Interfaces.Ilogin;

public class funcionario extends pessoa implements Ilogin {

	private String funcao;
	private double salario;
	private int cargaSemanal;

	public funcionario() {

	}

	public funcionario(String funcao, double salario, String nome, int idade, String cpf, int cargaSemanal, char sexo,
			String senha) {
		super(nome, idade, cpf, sexo, senha);
		this.funcao = funcao;
		this.salario = salario;
		this.cargaSemanal = cargaSemanal;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCargaSemanal() {
		return cargaSemanal;
	}

	public void setCargaSemanal(int cargaSemanal) {
		this.cargaSemanal = cargaSemanal;
	}

	public void login(String tentativa) {
		if (getSenha().equals(tentativa)) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Login inválido!Tente novamente.");
		}

	}

	public void cadastro(String novaSenha) {
			System.out.println("Cadastro feito com sucesso!");
			setSenha(novaSenha);
		}

}
