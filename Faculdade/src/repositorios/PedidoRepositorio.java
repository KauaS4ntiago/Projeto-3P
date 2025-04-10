package repositorios;

import java.util.ArrayList;
import entidades.Produto;

public class PedidoRepositorio {
//Fila
	private ArrayList<Produto> pedidos = new ArrayList<>();

	// CREATE (C)
	public void adicionarProdutoAoPedido(Produto produto) {
		pedidos.add(produto);
		System.out.println("Produto adicionado ao pedido com sucesso!");
	}

	// READ (R)
	public ArrayList<Produto> listarProdutosNoPedido() {
		return pedidos;
	}

	// UPDATE (U) 
	public boolean substituirProdutoNoPedido(int ID, Produto novoProduto) {
	    for (int i = 0; i < pedidos.size(); i++) {
	        if (pedidos.get(i).getID() == ID) {
	            pedidos.set(i, novoProduto);
	            System.out.println("Produto substituído com sucesso!");
	            return true;
	        }
	    }
	    System.out.println("Produto no pedido não encontrado.");
	    return false;
	}

	// DELETE (D)
	public Produto removerProdutoDoPedido() {
		if (pedidos.isEmpty()) {
			System.out.println("Nenhum pedido na fila para remover.");
			return null;
		}
		return pedidos.remove(0);
	}

	public boolean empty() {
		return pedidos.isEmpty();
	}

	public int size() {
		return pedidos.size();
	}
}