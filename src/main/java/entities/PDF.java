package entities;

public class PDF extends Documento implements DocDigital{
	public static Boolean executavel = false;

	public PDF(int id, String nome, String genero, String descricao, String localizacao) {
		super(id, nome, genero, descricao, localizacao);
	}

	public static Boolean getExecutavel() {
		return executavel;
	}

	@Override
	public String toString() {
		return "PDF [getNome()=" + getNome() + ", getGenero()=" + getGenero() + ", getDescricao()=" + getDescricao()
				+ ", getLocalizacao()=" + getLocalizacao() + ", toString()=" + super.toString() + "]";
	}
	
	public PDF pesquisarPDF(int id) {
		return bancoDados.findById(id);
	}
	public boolean adicionarPDF(PDF pdf) {
		return bancoDados.add(pdf);
	}
	public boolean excluirPDF(int id) {
		return bancoDados.delete(pesquisarPDF(id));
	}

	@Override
	public void executar() {
		System.out.println("Abrindo o PDF no Adobe Acrobat.");
	}
}