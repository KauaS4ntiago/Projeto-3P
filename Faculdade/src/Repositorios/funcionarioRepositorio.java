package Repositorios;

import Entidades.cliente;
import Entidades.funcionario;
import java.util.ArrayList;

public class funcionarioRepositorio {

	private ArrayList<funcionario> funcionarios = new ArrayList<>();

	public void salvarFuncionario(funcionario funcionario) {
		funcionarios.add(funcionario);
		System.out.println("Funcionário salvo com sucesso!");
	}

	public ArrayList<funcionario> listar() {
		return funcionarios;
	}

	public void promocao() {

	}
	
}
