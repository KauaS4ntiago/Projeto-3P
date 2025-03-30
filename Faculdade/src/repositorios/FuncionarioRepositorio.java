package repositorios;

import java.util.ArrayList;
import entidades.Funcionario;

public class FuncionarioRepositorio {

	private ArrayList<Funcionario> funcionarios = new ArrayList<>();

	// CREATE (C)
	public void salvarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
		System.out.println("Funcionário salvo com sucesso!");
	}

	// READ (R)
	public ArrayList<Funcionario> listarFuncionarios() {
		return funcionarios;
	}

	// UPDATE (U)
	public void alterarFuncionario(int ID) {
		for (Funcionario f : funcionarios) {
			if (f.getID() == ID) {
				break;
			}
		}
	}

	// DELETE (D)
	public void demitirFuncionario(int ID) {
		boolean encontrado = false;
		for (Funcionario f : funcionarios) {
			if (f.getID() == ID) {
				// tornar funcionário cliente não membro
				encontrado = true;
				System.out.println("Funcionário Demitido");
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Funcionário não encontrado!");
		}
	}

}
