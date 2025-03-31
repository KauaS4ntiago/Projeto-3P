package repositorios;

import java.util.ArrayList;
import interfaces.IrepositorioCliente;

import entidades.Cliente;

public class ClienteRepositorio implements IrepositorioCliente {

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
				switch (valor.toLowerCase()) {
				case "nome":
					c.setNome((String) novoValor);
					break;
				case "email":
					c.setEmail((String) novoValor);
					break;
				case "idade":
					c.setIdade((int) novoValor);
					break;
				case "senha":
					c.setSenha((String) novoValor);
					break;
				case "membro":
					c.setMembro((boolean) novoValor);
					break;
				default:
					System.out.println("Campo inválido!");
					return false;
				}
				System.out.println("Cliente atualizado com sucesso!");
				return true;
			}
		}
		System.out.println("Cliente não encontrado.");
		return false;
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

	public boolean empty() {
		return clientes.isEmpty();
	}

	public int size() {
		return clientes.size();
	}
}
