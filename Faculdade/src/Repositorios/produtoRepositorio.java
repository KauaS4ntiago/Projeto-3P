package Repositorios;

import Entidades.produto;
import java.util.ArrayList;

public class produtoRepositorio {

	private ArrayList<produto> produtos = new ArrayList<>();

	public void adicionarProduto(produto produto) {
		produtos.add(produto);
		System.out.println("Produto salvo com sucesso!");
	}

}
