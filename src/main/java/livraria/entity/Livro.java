package livraria.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String editora;
	private String autor;
	private int numero;
	private int ano;
	@OneToOne
	private Emprestimo emprestimo;

	public Livro(String nome, String editora, String autor, int numero, int ano) {
		this.nome = nome;
		this.editora = editora;
		this.autor = autor;
		this.numero = numero;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public String getEditora() {
		return editora;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumero() {
		return numero;
	}

	public int getAno() {
		return ano;
	}

	public Emprestimo getEmprestimo() {
		return emprestimo;
	}
	
	
	

}