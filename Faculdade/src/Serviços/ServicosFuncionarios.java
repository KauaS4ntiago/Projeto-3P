package Serviços;

import Entidades.Funcionario;
import Repositorios.FuncionarioRepositorio;
import Interfaces.Ilogin;

public class ServicosFuncionarios implements Ilogin {

	private FuncionarioRepositorio repository;

	public boolean autenticar(String email, String senha) {
		for (Funcionario f : repository.listar()) {
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
