package view;

import java.util.Scanner;
import repositorios.ClienteRepositorio;
import repositorios.FuncionarioRepositorio;
import repositorios.PedidoRepositorio;
import repositorios.ProdutoRepositorio;
import servicos.ServicosClientes;
import servicos.ServicosFuncionarios;
import servicos.ServicosPedido;
import servicos.ServicosProduto;
import entidades.Cliente;
import entidades.Produto;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ClienteRepositorio clienteRepo = new ClienteRepositorio();
		FuncionarioRepositorio funcionarioRepo = new FuncionarioRepositorio();
		ProdutoRepositorio produtoRepo = new ProdutoRepositorio();
		PedidoRepositorio pedidoRepo = new PedidoRepositorio();

		ServicosClientes servicosClientes = new ServicosClientes(clienteRepo);
		ServicosFuncionarios servicosFuncionarios = new ServicosFuncionarios(funcionarioRepo);
		ServicosProduto servicosProduto = new ServicosProduto(produtoRepo);
		ServicosPedido servicosPedido = new ServicosPedido(pedidoRepo);

		while (true) {
			System.out.println("MENU:");
			System.out.println("1. Adicionar Cliente");
			System.out.println("2. Listar Clientes");
			System.out.println("3. Adicionar Produto");
			System.out.println("4. Listar Produtos");
			System.out.println("5. Adicionar Produto ao Pedido");
			System.out.println("6. Remover Produto do Pedido");
			System.out.println("7. Finalizar Pedido");
			System.out.println("8. Sair");
			System.out.print("Escolha uma opção: ");
			int opcao = sc.nextInt();
			sc.nextLine(); 

			switch (opcao) {
			case 1:
				// Adicionar Cliente
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				Cliente cliente = new Cliente(nome, "email@example.com", 30, "123456789", 'M', false, "senha",
						clienteRepo.size() + 1);
				servicosClientes.adicionarCliente(cliente);
				break;
			case 2:
				// Listar Clientes
				for (Cliente c : clienteRepo.listarClientes()) {
					System.out.println("Cliente: " + c.getNome());
				}
				break;
			case 3:
				// Adicionar Produto
				System.out.print("Nome do Produto: ");
				String produtoNome = sc.nextLine();
				Produto produto = new Produto(produtoNome, "MarcaX", 10.0, 5, produtoRepo.size() + 1);
				servicosProduto.adicionar(produto);
				break;
			case 4:
				// Listar Produtos
				for (Produto p : produtoRepo.listarProdutos()) {
					System.out.println("Produto: " + p.getNome() + " - R$ " + p.getPreco());
				}
				break;
			case 5:
				// Adicionar Produto ao Pedido
				System.out.print("Digite o ID do Produto para adicionar ao pedido: ");
				int produtoId = sc.nextInt();
				Produto p = null;
				for (Produto prod : produtoRepo.listarProdutos()) {
					if (prod.getID() == produtoId) {
						p = prod;
						break;
					}
				}
				if (p != null) {
					servicosPedido.adicionarProduto(p);
				} else {
					System.out.println("Produto não encontrado.");
				}
				break;
			case 6:
				// Remover Produto do Pedido
				Produto produtoRemovido = servicosPedido.removerProduto();
				if (produtoRemovido != null) {
					System.out.println("Produto removido do pedido: " + produtoRemovido.getNome());
				}
				break;
			case 7:
				// Finalizar Pedido
				double total = servicosPedido.finalizarPedido();
				System.out.println("Total do Pedido: R$ " + total);
				break;
			case 8:
				System.out.println("Saindo...");
				sc.close(); // Fechar o programa
				return;
			default:
				System.out.println("Opção inválida!");
			}
		}
	}
}

