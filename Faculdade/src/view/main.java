package view;

import java.util.Scanner;
import java.util.ArrayList;
import Entidades.produto;
import Entidades.cliente;
import Entidades.funcionario;
import Entidades.estoque;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Bem Vindo!");
			System.out.println("Digite de acordo com a sua necessidade:");
			System.out.println("1-Fazer compras sem cadastro.");
			System.out.println("2-Fazer cadastro.");
			System.out.println("3-Fazer login.");
			System.out.println("4-Sair do sistema.");
			int n = sc.nextInt();
			switch (n) {
			case (1):

				break;
			case (2):

				break;
			case (3):
				System.out.println("Digite seu");
				break;
			case (4):
				System.out.println("Encerrando o programa...;");
				sc.close();
				return;
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}

		}

	}

}
