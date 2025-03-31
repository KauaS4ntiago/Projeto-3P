package interfaces;

import java.util.ArrayList;

import entidades.Funcionario;

public interface IrepositorioFuncionario {

	public void salvarFuncionario(Funcionario funcionario);

	public ArrayList<Funcionario> listarFuncionarios();

	public boolean atualizarFuncionario(int ID, String valor, Object novoValor);

	public void demitirFuncionario(int ID);
}
