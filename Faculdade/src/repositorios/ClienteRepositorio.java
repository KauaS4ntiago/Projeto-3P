package repositorios;

import java.util.ArrayList;

import entidades.Cliente;

public class ClienteRepositorio {

	private ArrayList<Cliente> clientes = new ArrayList<>();

	// CREATE (C)
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
		System.out.println("Cliente salvo com sucesso!");
	}

	// READ (R)
	public ArrayList<Cliente> listarClientes() {
		return clientes;
	}
	
	// UPDATE (U)
	
	// DELETE (D)
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
}
