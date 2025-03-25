package repositorios;

import java.util.ArrayList;

import entidades.Produto;

public class ProdutoRepositorio {

	private ArrayList<Produto> produtos = new ArrayList<>();

	public void adicionarEstoque(Produto produto) {
		produtos.add(produto);
		System.out.println("Produto salvo com sucesso!");
	}

	public Produto removerEstoque(int ID) {
		for (Produto p : produtos) {
			if (p.getID() == ID) {
				produtos.remove(p);
				return p;
			}
		}
		System.out.println("Produto fora do estoque!");
		return null;

	}

	public ArrayList<Produto> listarProdutos() {
		return produtos;
	}

//alterar atributos
	public void alterarNome(int ID, String novoNome) {
		boolean encontrado = false;
		for (Produto p : produtos) {
			if (p.getID() == ID) {
				p.setNome(novoNome);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Produto não encontrado!");
		}

	}

	public void alterarMarca(int ID, String novaMarca) {
		boolean encontrado = false;
		for (Produto p : produtos) {
			if (p.getID() == ID) {
				p.setMarca(novaMarca);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Produto não encontrado!");
		}

	}

	public void alterarPreco(int ID, double novoPreco) {
		boolean encontrado = false;
		for (Produto p : produtos) {
			if (p.getID() == ID) {
				p.setPreco(novoPreco);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Produto não encontrado!");
		}

	}
}
