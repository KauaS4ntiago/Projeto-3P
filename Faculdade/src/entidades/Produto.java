package entidades;

public class Produto extends Estoque {

	private String nome;
	private String marca;
	private double preco;

	public Produto() {

	}

	public Produto(String nome, String marca, double preco, int qnt, int ID) {
		super(qnt, ID);
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
