package Entidades;

import Interfaces.Ilogin;

public class funcionario extends pessoa {

	private String funcao;
	private double salario;
	private int cargaSemanal;

	public funcionario() {

	}

	public funcionario(String funcao, double salario, String nome, String email, int idade, String cpf,
			int cargaSemanal, char sexo, String senha) {
		super(nome, email, idade, cpf, sexo, senha);
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

}
