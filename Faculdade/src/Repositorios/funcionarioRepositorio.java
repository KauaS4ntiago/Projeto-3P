package Repositorios;

import Entidades.cliente;
import Entidades.funcionario;
import Interfaces.Ilogin;
import java.util.ArrayList;

public class funcionarioRepositorio implements Ilogin {

	private ArrayList<funcionario> funcionarios = new ArrayList<>();

	public void salvarFuncionario(funcionario funcionario) {
		funcionarios.add(funcionario);
		System.out.println("Funcionário salvo com sucesso!");
	}

	public void demitirFuncionario(int ID) {
		for (funcionario f : funcionarios) {
			if (f.getID() == ID) {
				// tornar funcionário cliente não membro
				System.out.println("Funcionário Demitido");
			} else {
				System.out.println("Funcionário não encontrado.");
			}
		}
	}

	public ArrayList<funcionario> listar() {
		return funcionarios;
	}

	public boolean autenticar(String email, String senha) {
		for (funcionario f : funcionarios) {
			if (f.getEmail().equals(email) && f.getSenha().equals(senha)) {
				System.out.println("Login efetuado com sucesso!");
				return true;
			}
		}
		System.out.println("Email ou senha inválidos.");
		return false;
	}

	public void promocao() {
		//falta alterações
	}

}
