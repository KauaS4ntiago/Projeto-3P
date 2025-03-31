package interfaces;

import java.util.ArrayList;

import entidades.Cliente;

public interface IrepositorioCliente {
	public void adicionarCliente(Cliente cliente);

	public ArrayList<Cliente> listarClientes();

	public boolean atualizarCliente(int ID, String valor, Object novoValor);

	public void desativarCliente(int ID);
}
