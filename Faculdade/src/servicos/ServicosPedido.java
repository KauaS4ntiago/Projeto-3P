package servicos;

import entidades.Produto;
import repositorios.PedidoRepositorio;
import java.util.ArrayList;

public class ServicosPedido {

	private PedidoRepositorio repository;

	public ServicosPedido(PedidoRepositorio repository) {
		this.repository = repository;
	}

	// Adicionar produto ao pedido (Carrinho)
	public void adicionarProduto(Produto produto) {
		repository.adicionarProdutoAoPedido(produto);
	}

	// Remover produto do pedido 
	public Produto removerProduto() {
		return repository.removerProdutoDoPedido();
	}

	// Substituir um produto no pedido
	public boolean substituirProduto(int ID, Produto novoProduto) {
		return repository.substituirProdutoNoPedido(ID, novoProduto);
	}

	// Listar produtos no pedido
	public ArrayList<Produto> listarProdutos() {
		return repository.listarProdutosNoPedido();
	}

	// Finalizar pedido: Soma o total e esvazia o carrinho
	public double finalizarPedido() {
		if (repository.empty()) {
			System.out.println("Não há produtos no carrinho.");
			return 0.0;
		}

		double total = 0.0;
		for (Produto p : repository.listarProdutosNoPedido()) {
			total += p.getPreco();
		}

		// Esvazia o carrinho enquanto finaliza o pedido
		while (!repository.empty()) {
			repository.removerProdutoDoPedido();
		}
		
		System.out.println("Pedido finalizado! Total: R$ " + total);
		return total;
	}
}
