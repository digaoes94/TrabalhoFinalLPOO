package entities;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Documento {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	// AS CLASSES HERDEIRAS TAMBÉM HERDARÃO OS ID'S
	
	@Column(nullable = false) 
	private String nome;
	
	@Column(length = 500) // AUMENTA O TAMANHO PARA POSSÍVEIS DESCRIÇÕES LONGAS
    private String descricao;
	
	private String assunto;
	
	public Documento() {		
	}
	
	
	public Documento(String nome, String assunto, String descricao) {
		this.nome = nome;
		this.assunto = assunto;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
