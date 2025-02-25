package Repositorios;

import Entidades.cliente;
import java.util.ArrayList;

public class clienteRepositorio {

	private ArrayList<cliente> clientes = new ArrayList<>();

	public void salvarCliente(cliente cliente) {
		clientes.add(cliente);
		System.out.println("Cliente salvo com sucesso!");
	}

	public ArrayList<cliente> listar() {
		return clientes;
	}
}
