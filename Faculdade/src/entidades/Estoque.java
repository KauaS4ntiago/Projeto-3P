package entidades;

public class Estoque {

	private int qnt;
	private int ID;

	public Estoque() {

	}

	public Estoque(int qnt, int ID) {

		this.qnt = qnt;
		ID = ID;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

}
