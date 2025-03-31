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
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");
			int opcao = sc.nextInt();
			sc.nextLine(); 

			switch (opcao) {
			case 1:
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				Cliente cliente = new Cliente(nome, "email@example.com", 30, "123456789", 'M', false, "senha",
						clienteRepo.size() + 1);
				clienteRepo.adicionarCliente(cliente);
				break;
			case 2:
				for (Cliente c : clienteRepo.listarClientes()) {
					System.out.println("Cliente: " + c.getNome());
				}
				break;
			case 3:
				System.out.print("Nome do Produto: ");
				String produtoNome = sc.nextLine();
				Produto produto = new Produto(produtoNome, "MarcaX", 10.0, 5, produtoRepo.size() + 1);
				produtoRepo.adicionarProduto(produto);
				break;
			case 4:
				for (Produto p : produtoRepo.listarProdutos()) {
					System.out.println("Produto: " + p.getNome() + " - R$ " + p.getPreco());
				}
				break;
			case 5:
				System.out.println("Saindo...");
				sc.close(); // Fechar o scanner após o término do programa
				return;
			default:
				System.out.println("Opção inválida!"); // Resposta padrão para opções inválidas
			}
		}
	}
}
