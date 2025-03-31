package repositorios;

import java.util.ArrayList;
import interfaces.IrepositorioCliente;

import entidades.Cliente;

public class ClienteRepositorio implements IrepositorioCliente {
//Fila
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
	public boolean atualizarCliente(int ID, String valor, Object novoValor) {
		for (Cliente c : clientes) {
			if (c.getID() == ID) {
				switch (valor) {
				case "nome":
					c.setNome((String) novoValor);
					break;
				case "email":

				case "senha":
				}
			}
		}

	}

	// DELETE (D)
	public void desativarCliente(int ID) {
		for (Cliente cliente : clientes) {
			if (cliente.getID() == ID) {
				cliente.setAtivo(false);
				System.out.println("Cliente desativado com sucesso!");
				return;
			}
		}
		System.out.println("Cliente não encontrado!");
	}
}
