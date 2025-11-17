package entities;

import jakarta.persistence.*;

@Entity //MARCA COMO UMA ENTIDADE JPA E SERÁ A TABELA PRINCIPAL
@Table(name = "revista")  

public class Revista extends DocFisico {
	
	@Column(name = "edicao")
	private String edicao;
	@Column(name = "fotografo_principal", nullable = false)
	private String fotografo;
	
	public Revista(String nome, String assunto, String descricao, String localizacao, String edicao, String fotografo) {
		super(nome, assunto, descricao, localizacao);
		this.edicao = edicao;
		this.fotografo = fotografo;
	}
	
	public Revista() {
		
	}
	public String getEdicao() {
		return edicao;
	}

	public String getFotografo() {
		return fotografo;
	}

	

	
}
