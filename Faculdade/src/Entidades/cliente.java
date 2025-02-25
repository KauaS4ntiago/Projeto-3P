package Entidades;

public class cliente extends pessoa {

	private boolean membro;
	private boolean ativo;

	public cliente() {

	}

	public cliente(String nome, String email, int idade, String cpf, char sexo, boolean membro, String senha, int ID) {
		super(nome, email, idade, cpf, sexo, senha, ID);
		this.membro = membro;
		ativo = true;
	}

	public boolean getMembro() {
		return membro;
	}

	public void setMembro(boolean membro) {
		this.membro = membro;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
}
