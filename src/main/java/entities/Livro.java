package entities;

public class Livro extends Documento implements DocFisico {
	private String autor;

	public Livro(int id, String nome, String genero, String descricao, String localizacao, String autor) {
		super(id, nome, genero, descricao, localizacao);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + "]";
	}
	
	public Livro pesquisarLivro(int id) {
		return bancoDados.findById(id);
	}
	public boolean adicionarLivro(Livro livro) {
		return bancoDados.add(livro);
	}
	public boolean excluirLivro(int id) {
		return bancoDados.delete(pesquisarLivro(id));
	}

	@Override
	public String localizar() {
		return String.format("O livro %s se encontra em %s", this.getNome(), this.getLocalizacao());
	}
}