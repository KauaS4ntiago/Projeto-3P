package servicos;

import entidades.Funcionario;
import interfaces.Ilogin;
import repositorios.FuncionarioRepositorio;

public class ServicosFuncionarios implements Ilogin {

	private FuncionarioRepositorio repository;

	public ServicosFuncionarios(FuncionarioRepositorio repository) {
		this.repository = repository;
	}

	public void adicionarFuncionario(Funcionario funcionario) {
		repository.salvarFuncionario(funcionario);
	}

	public void removerFuncionario(int ID) {
		repository.demitirFuncionario(ID);
	}

	public boolean autenticar(String email, String senha) {
		for (Funcionario f : repository.listarFuncionarios()) {
			if (f.getEmail().equals(email) && f.getSenha().equals(senha)) {
				System.out.println("Login efetuado com sucesso!");
				return true;
			}
		}
		System.out.println("Email ou senha inválidos.");
		return false;
	}

	public void aumento(int ID, double aumento) {
		for (Funcionario f : repository.listarFuncionarios()) {
			if (f.getID() == ID) {
				f.setSalario(f.getSalario() + aumento);
				System.out.println();
				return;
			}
		}
	}

	public void reducao(int ID, double reducao) {
		for (Funcionario f : repository.listarFuncionarios()) {
			if (f.getID() == ID) {
				f.setSalario(f.getSalario() - reducao);
				return;
			}
		}
	}
}
