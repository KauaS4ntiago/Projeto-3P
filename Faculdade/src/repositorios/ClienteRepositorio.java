package repositorios;

import java.util.ArrayList;

import entidades.Cliente;

public class ClienteRepositorio {

	private ArrayList<Cliente> clientes = new ArrayList<>();

	public void salvarCliente(Cliente cliente) {
		clientes.add(cliente);
		System.out.println("Cliente salvo com sucesso!");
	}

	public void desativarCliente(int ID) {
		boolean encontrado = false;
		for (Cliente c : clientes) {
			if (ID == c.getID()) {
				c.setAtivo(false);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Cliente não encontrado!");
		}
	}

	public ArrayList<Cliente> listarClientes() {
		return clientes;
	}

//falta modificar
	public void alterarCliente(int ID, String NovoNome) {
		boolean encontrado = false;
		for (Cliente c : clientes) {
			if (ID == c.getID()) {
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Cliente não encontrado!");
		}
	}

}
