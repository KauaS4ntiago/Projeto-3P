package Entidades;

import Interfaces.Ilogin;

public class cliente extends pessoa implements Ilogin {

	private boolean membro;

	public cliente() {

	}

	public cliente(String nome, int idade, String cpf, char sexo, boolean membro, String senha) {
		super(nome, idade, cpf, sexo, senha);
		this.membro = membro;
	}

	public boolean isMembro() {
		return membro;
	}

	public void setMembro(boolean membro) {
		this.membro = membro;
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
