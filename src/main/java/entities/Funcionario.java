package entities;

import jakarta.persistence.*;

@Entity // MARCA COMO UMA ENTIDADE JPA E SERÁ A TABELA PRINCIPAL
@Table(name = "funcionarios")
public class Funcionario extends Pessoa {

	@Column(name = "matricula_do_funcionário", nullable = false, unique = true)
	private String matriculaFuncionario;

	public Funcionario(String nome, String cpf, String email, String celular, String matriculaFuncionario) {
		super(nome, cpf, email, celular);
		this.matriculaFuncionario = matriculaFuncionario;
	}

	public String getMatriculaFuncionario() {
		return matriculaFuncionario;
	}

	public void setMatriculaFuncionario(String matriculaFuncionario) {
		this.matriculaFuncionario = matriculaFuncionario;
	}

	@Override
	public String toString() {
		return super.toString() + " Funcionario [matriculaFuncionario=" + matriculaFuncionario + "]";
	}

}
