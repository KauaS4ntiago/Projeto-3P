package Entidades;

public class Cliente extends Pessoa {

	private boolean membro;
	private boolean ativo;

	public Cliente() {

	}

	public Cliente(String nome, String email, int idade, String cpf, char sexo, boolean membro, String senha, int ID) {
		super(nome, email, idade, cpf, sexo, senha, ID);
		this.membro = membro;
		ativo = true;
	}

	public boolean isMembro() {
		return membro;
	}

	public void setMembro(boolean membro) {
		this.membro = membro;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
}
