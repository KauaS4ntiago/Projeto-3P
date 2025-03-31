package repositorios;

import java.util.ArrayList;
import interfaces.IrepositorioProduto;
import entidades.Produto;

public class ProdutoRepositorio implements IrepositorioProduto{

	private ArrayList<Produto> produtos = new ArrayList<>();

	// CREATE(C)
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
		System.out.println("Produto salvo com sucesso!");
	}

	// READ(R)
	public ArrayList<Produto> listarProdutos() {
		return produtos;
	}

	// UPDATE(U)
	public boolean alterarValor(int ID, String valor, Object novoValor) {
		for (Produto p : produtos) {
			if (p.getID() == ID) {
				switch (valor.toLowerCase()) {
				case "nome":
					p.setNome((String) novoValor);
					break;
				case "marca":
					p.setMarca((String) novoValor);
					break;
				case "preço":
					p.setPreco((double) novoValor);
					break;
				default:
					System.out.println("Valor inválido!");
					break;
				}
			}
			System.out.println("Produto atualizado com sucesso!");
			return true;
		}
		System.out.println("Produto não encontrado.");
		return false;
	}

	// DELETE(D)
	public Produto removerProduto(int ID) {
		for (Produto p : produtos) {
			if (p.getID() == ID) {
				produtos.remove(p);
				return p;
			}
		}
		System.out.println("Produto fora do estoque!");
		return null;

	}

	public boolean empty() {
		return produtos.isEmpty();
	}

	public int size() {
		return produtos.size();
	}
}
