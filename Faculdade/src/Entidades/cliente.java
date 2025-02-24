package Entidades;

import Interfaces.Ilogin;

public class cliente extends pessoa{

	private boolean membro;

	public cliente() {

	}

	public cliente(String nome,String email, int idade, String cpf, char sexo, boolean membro, String senha) {
		super(nome,email, idade, cpf, sexo, senha);
		this.membro = membro;
	}

	public boolean isMembro() {
		return membro;
	}

	public void setMembro(boolean membro) {
		this.membro = membro;
	}
}
