package interfaces;

import java.util.ArrayList;

import entidades.Produto;

public interface IrepositorioPedido {

	public void adicionarProdutoAoPedido(Produto produto);

	public ArrayList<Produto> listarProdutosNoPedido();

	public boolean substituirProdutoNoPedido(int ID, Produto novoProduto);

	public Produto removerProdutoDoPedido();

}
