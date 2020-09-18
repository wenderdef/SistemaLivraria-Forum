package livraria.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Reservar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeLivro;
	@OneToMany
	private List<Academico> academicos = new ArrayList();

	public Reservar(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public List<Academico> getAcademicos() {
		return academicos;
	}
	
	public void addAcademicos(Academico a) {
		academicos.add(a);		
	}

}