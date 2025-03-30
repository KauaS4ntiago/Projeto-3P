package serviços;

import entidades.Funcionario;
import interfaces.Ilogin;
import repositorios.FuncionarioRepositorio;

public class ServicosFuncionarios implements Ilogin {

	private FuncionarioRepositorio repository;

	public ServicosFuncionarios(FuncionarioRepositorio repository) {
		this.repository = repository;
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

	public void promocao() {
		// falta alterações
	}
}
