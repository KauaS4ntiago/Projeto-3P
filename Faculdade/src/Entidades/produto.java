package Entidades;

public class produto extends estoque {

	private String nome;
	private String marca;
	private double preco;

	public produto() {

	}

	public produto(String nome, String marca, double preco, int qnt, String iD) {
		super(qnt, iD);
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
