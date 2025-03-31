package interfaces;

import java.util.ArrayList;

import entidades.Produto;

public interface IrepositorioProduto {
	public void adicionarProduto(Produto produto);

	public ArrayList<Produto> listarProdutos();

	public boolean alterarValor(int ID, String valor, Object novoValor);

	public Produto removerProduto(int ID);

}
