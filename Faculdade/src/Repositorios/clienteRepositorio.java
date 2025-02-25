package Repositorios;

import Entidades.cliente;
import Interfaces.Ilogin;
import java.util.ArrayList;

public class clienteRepositorio implements Ilogin {

	private ArrayList<cliente> clientes = new ArrayList<>();

	public void salvarCliente(cliente cliente) {
		clientes.add(cliente);
		System.out.println("Cliente salvo com sucesso!");
	}

	public void desativarCliente(int ID) {
		for (cliente c : clientes) {
			if (ID == c.getID()) {
				c.setAtivo(false);
			} else {
				System.out.println("Cliente não encontrado.");
			}
		}
	}

	public boolean autenticar(String email, String senha) {
		for (cliente c : clientes) {
			if (c.getEmail().equals(email) && c.getSenha().equals(senha)) {
				System.out.println("Login efetuado com sucesso!");
				return true;
			}	
		}
		System.out.println("Email ou senha inválidos.");
		return false;
	}

	public ArrayList<cliente> listar() {
		return clientes;
	}

	public void tornarMembro(int ID) {
		for (cliente c : clientes) {
			if (ID == c.getID()) {
				c.setMembro(true);
				System.out.println("Membro adicionado com sucesso!");
			} else {
				System.out.println("Cliente não encontrado.");
			}
		}

	}

	public void retirarMembro(int ID) {
		for (cliente c : clientes) {
			if (ID == c.getID()) {
				if (c.getMembro() == true) {
					c.setMembro(false);
					System.out.println("Membro cancelado com sucesso!");
				}
			}
		}
	}
}
