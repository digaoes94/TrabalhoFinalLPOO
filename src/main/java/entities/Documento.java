package entities;

public abstract class Documento {
	private int id;
	private String nome, genero, descricao, localizacao;

	public Documento(int id, String nome, String genero, String descricao, String localizacao) {
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.descricao = descricao;
		this.localizacao = localizacao;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	@Override
	public String toString() {
		return "Documento [id=" + id + ", nome=" + nome + ", genero=" + genero + ", descricao=" + descricao
				+ ", localizacao=" + localizacao + "]";
	}

	public Emprestimo[] verEmprestimos() {
		return bancoDados.findAll(id);
	}
}
