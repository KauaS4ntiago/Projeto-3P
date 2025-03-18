package serviços;

import entidades.Produto;
import repositorios.ProdutoRepositorio;

public class ServicosProduto {

	private ProdutoRepositorio repository;

	public void aumentarPreco(int ID, double aumento) {
		boolean encontrado = false;
		for (Produto p : repository.listarProdutos()) {
			if (p.getID() == ID) {
				p.setPreco(p.getPreco() + aumento);
				System.out.println("Aumento de" + aumento + "R$ em " + p.getNome() + " Efetuado com sucesso!");
				System.out.println("Novo preço: "+ p.getPreco());
			}
		}
		if (!encontrado) {
			System.out.println("Produto não encontrado!");
		}
	}

	public void diminuirPreco(int ID, double reducao) {
		boolean encontrado = false;
		for (Produto p : repository.listarProdutos()) {
			if (p.getID() == ID) {
				p.setPreco(p.getPreco() + reducao);
				System.out.println("Redução de" + reducao + "R$ em " + p.getNome() + " Efetuado com sucesso!");
				System.out.println("Novo preço: "+ p.getPreco());
			}
		}
		if (!encontrado) {
			System.out.println("Produto não encontrado!");
		}
	}
	
}
