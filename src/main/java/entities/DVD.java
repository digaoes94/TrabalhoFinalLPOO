package entities;

public class DVD extends Documento implements DocDigital{
	public static Boolean executavel = true;

	public DVD(int id, String nome, String genero, String descricao, String localizacao) {
		super(id, nome, genero, descricao, localizacao);
	}

	public static Boolean getExecutavel() {
		return executavel;
	}

	@Override
	public String toString() {
		return "DVD [getNome()=" + getNome() + ", getGenero()=" + getGenero() + ", getDescricao()=" + getDescricao()
				+ ", getLocalizacao()=" + getLocalizacao() + ", toString()=" + super.toString();
	}
	
	public DVD pesquisarDVD(int id) {
		return bancoDados.findById(id);
	}
	public boolean adicionarDVD(DVD dvd) {
		return bancoDados.add(dvd);
	}
	public boolean excluirDVD(int id) {
		return bancoDados.delete(pesquisarDVD(id));
	}

	@Override
	public void executar() {
		System.out.println("Tocando vídeo no Windows Music Player.");		
	}
}