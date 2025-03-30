package view;

import java.util.Scanner;
import java.util.ArrayList;
import serviços.ServicosClientes;
import serviços.ServicosFuncionarios;
import serviços.ServicosPedido;
import serviços.ServicosProduto;
import repositorios.ClienteRepositorio;
import repositorios.FuncionarioRepositorio;
import repositorios.ProdutoRepositorio;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ClienteRepositorio clienterepositorio = new ClienteRepositorio();
		FuncionarioRepositorio funcionariorepositorio = new FuncionarioRepositorio();
		ProdutoRepositorio produtorepositorio = new ProdutoRepositorio();

		ServicosClientes servicoscliente = new ServicosClientes(clienterepositorio);
		ServicosFuncionarios servicosfuncionarios = new ServicosFuncionarios(funcionariorepositorio);
		ServicosProduto servicosProduto = new ServicosProduto(produtorepositorio);
		ServicosPedido servicosPedido = new ServicosPedido(produtorepositorio);
		servicosProduto.adicionarProduto("Coca cola", "coca", 0.50, 100, 69);
		while (true) {

			System.out.println("Bem Vindo!");
			System.out.println("Digite de acordo com a sua necessidade:");
			System.out.println();
			System.out.println("1-Fazer compras sem cadastro.");
			System.out.println("2-Fazer cadastro.");
			System.out.println("3-Fazer login.");
			System.out.println("4-Administração.");
			System.out.println("5-Sair do sistema.");
			System.out.println();
			int n = sc.nextInt();
			switch (n) {
			case (1):
				ServicosProduto.listarProdutos();
				System.out.println("Digite qual produto você deseja buscar:");

				/*
				 * 1 passo(colocar um mecanismo de pesquisar os produtos) / 2 passo(listar todos
				 * os produtos com info) 3 passo(fechamento do pedido) / 4 passo(emitir nota
				 * fiscal)
				 */
				break;
			case (2):

				/*
				 * 1 passo(fazer cadastro) / 2 passo (perguntar se deseja ser membro) / 3
				 * passo(colocar um mecanismo de pesquisar os produtos) 4 passo(listar todos os
				 * produtos com info) 5 passo(fechamento do pedido) / 6 passo(emitir nota
				 * fiscal)
				 */
				break;
			case (3):

				/*
				 * 1 passo(fazer login) / se for cliente[ 2 passo (perguntar se deseja ser
				 * membro) / 3 passo(colocar um mecanismo de pesquisar os produtos) 4
				 * passo(listar todos os produtos com info) 5 passo(fechamento do pedido) / 6
				 * passo(emitir nota fiscal)] se não for [ 2 passo (exibir informações do
				 * funcionário) / 3 passo (exibir habilidades do funcionário)
				 */
				break;
			case (4):

				/*
				 * 1 passo( fazer login) / passo 2( exibir habilidades da
				 * adm[add,remover,aumentar/diminuir salário...)
				 */
				break;
			case (5):
				System.out.println("Encerrando o programa...");
				sc.close();
				return;
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}

		}

	}

}
