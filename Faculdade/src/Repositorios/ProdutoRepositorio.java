package Repositorios;

import Entidades.Produto;
import java.util.ArrayList;

public class ProdutoRepositorio {

	private ArrayList<Produto> produtos = new ArrayList<>();

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
		System.out.println("Produto salvo com sucesso!");
	}

}
