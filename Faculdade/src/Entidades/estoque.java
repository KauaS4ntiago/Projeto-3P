package Entidades;

public class estoque {

	private int qnt;
	private String ID;
	private boolean disponivel;

	public estoque() {

	}

	public estoque(int qnt, String iD, boolean disponivel) {

		this.qnt = qnt;
		ID = iD;
		this.disponivel = false;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

}
