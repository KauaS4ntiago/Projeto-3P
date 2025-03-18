package repositorios;

import java.util.ArrayList;

import entidades.Produto;

public class ProdutoRepositorio {

	private ArrayList<Produto> produtos = new ArrayList<>();

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
		System.out.println("Produto salvo com sucesso!");
	}

	public Produto removerProduto(int ID) {
		boolean encontrado = false;
		for (Produto p : produtos) {
			if (p.getID() == ID) {
				encontrado = true;
				produtos.remove(p);
				return p;
			}
		}

		if (!encontrado) {
			System.out.println("Produto fora do estoque!");
		}
		return null;
	}

	public ArrayList<Produto> listarProdutos() {
		return produtos;
	}

}
