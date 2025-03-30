package serviços;

import entidades.Produto;
import repositorios.ProdutoRepositorio;
import java.util.ArrayList;

public class ServicosPedido {

	private ArrayList<Produto> carrinho = new ArrayList<>();
	private ProdutoRepositorio repository;

	// falta melhorar os métodos

	public ServicosPedido(ProdutoRepositorio repository) {
		this.repository = repository;
	}

	public void adicionarProduto(String nome) {
		boolean encontrado = false;
		for (Produto p : repository.listarProdutos()) {
			if (p.equals(nome)) {
				encontrado = true;
				carrinho.add(p);
				System.out.println("Produto adicionado ao carrinho!");
			}
		}
		if (!encontrado) {
			System.out.println("Produto não encontrado ou fora de estoque!");
		}
	}

	public void removerProduto(String nome) {
		boolean encontrado = false;
		for (Produto p : repository.listarProdutos()) {
			if (p.equals(nome)) {
				encontrado = true;
				carrinho.remove(p);
				System.out.println("Produto removido do carrinho!");
			}
		}
		if (!encontrado) {
			System.out.println("Produto não encontrado ou fora de estoque!");
		}
	}

	public void esvaziarCarrinho() {
		carrinho.clear();
	}

//falta modificar 
	public double fecharPedido() {
		if (carrinho.size() != 0) {
			for (Produto p : carrinho) {
				return fecharPedido() + p.getPreco();
			}
		}
		double aux = fecharPedido();
		return aux;
	}

	public void gerarNotaFiscal() {

	}

}
