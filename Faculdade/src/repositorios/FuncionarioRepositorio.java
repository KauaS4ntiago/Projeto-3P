package repositorios;

import java.util.ArrayList;
import entidades.Cliente;
import entidades.Funcionario;

public class FuncionarioRepositorio {

	private ArrayList<Funcionario> funcionarios = new ArrayList<>();

	public void salvarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
		System.out.println("Funcionário salvo com sucesso!");
	}

	public void demitirFuncionario(int ID) {
		boolean encontrado = false;
		for (Funcionario f : funcionarios) {
			if (f.getID() == ID) {
				// tornar funcionário cliente não membro
				System.out.println("Funcionário Demitido");
				encontrado = true;
				break;
			}
			if (!encontrado) {
				System.out.println("Funcionário não encontrado.");
			}
		}
	}

	public ArrayList<Funcionario> listarFuncionarios() {
		return funcionarios;
	}

}
