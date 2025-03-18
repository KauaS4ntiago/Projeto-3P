package Entidades;

public class Estoque {

	private int qnt;
	private String ID;

	public Estoque() {

	}

	public Estoque(int qnt, String iD) {

		this.qnt = qnt;
		ID = iD;
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

}
