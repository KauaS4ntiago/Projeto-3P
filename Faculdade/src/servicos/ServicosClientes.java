package servicos;

import entidades.Cliente;
import interfaces.Ilogin;
import repositorios.ClienteRepositorio;

public class ServicosClientes implements Ilogin {

	private ClienteRepositorio repository;

	public ServicosClientes(ClienteRepositorio repository) {
		this.repository = repository;
	}

	public void adicionarCliente(Cliente cliente) {
		repository.adicionarCliente(cliente);
	}

	public void desativarCliente(int ID) {
		repository.desativarCliente(ID);
	}

	public boolean autenticar(String email, String senha) {
		for (Cliente c : repository.listarClientes()) {
			if (c.getEmail().equals(email) && c.getSenha().equals(senha)) {
				System.out.println("Login efetuado com sucesso!");
				return true;
			}
		}
		System.out.println("Email ou senha inválidos.");
		return false;
	}

	public void tornarMembro(int ID) {
		for (Cliente c : repository.listarClientes()) {
			if (ID == c.getID()) {
				c.setMembro(true);
				System.out.println("Membro adicionado com sucesso!");
			} else {
				System.out.println("Cliente não encontrado.");
			}
		}

	}

	public void retirarMembro(int ID) {
		for (Cliente c : repository.listarClientes()) {
			if (ID == c.getID()) {
				if (c.isMembro() == true) {
					c.setMembro(false);
					System.out.println("Membro cancelado com sucesso!");
				}
			}
		}
	}
}
