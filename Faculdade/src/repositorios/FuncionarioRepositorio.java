package repositorios;

import java.util.ArrayList;
import entidades.Funcionario;
import interfaces.IrepositorioFuncionario;

public class FuncionarioRepositorio implements IrepositorioFuncionario {

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
	public boolean atualizarFuncionario(int ID, String valor, Object novoValor) {
		for (Funcionario f : funcionarios) {
			if (f.getID() == ID) {
				switch (valor.toLowerCase()) {
				case "nome":
					f.setNome((String) novoValor);
					break;
				case "email":
					f.setEmail((String) novoValor);
					break;
				case "idade":
					f.setIdade((int) novoValor);
					break;
				case "salario":
					f.setSalario((double) novoValor);
					break;
				case "funcao":
					f.setFuncao((String) novoValor);
					break;
				default:
					System.out.println("Campo inválido!");
					return false;
				}
				System.out.println("Funcionário atualizado com sucesso!");
				return true;
			}
		}
		System.out.println("Funcionário não encontrado.");
		return false;
	}

	// DELETE (D)
	public void demitirFuncionario(int ID) {
		boolean encontrado = false;
		for (Funcionario f : funcionarios) {
			if (f.getID() == ID) {
				encontrado = true;
				System.out.println("Funcionário Demitido");
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Funcionário não encontrado!");
		}
	}
	
	public boolean empty() {
		return funcionarios.isEmpty();
	}

	public int size() {
		return funcionarios.size();
	}

}
