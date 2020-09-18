package livraria.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Emprestimo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dataEmp;
	private String horaEmp;
	private String dataEntrega;
	private boolean statusEmp;

	@OneToOne
	private Academico academico;
	
	@OneToMany
	private List<Livro> livros = new ArrayList();

	public Emprestimo(String dataEmp, String horaEmp, String dataEntrega, boolean statusEmp, Academico academico) {
		this.dataEmp = dataEmp;
		this.horaEmp = horaEmp;
		this.dataEntrega = dataEntrega;
		this.statusEmp = statusEmp;
		this.academico = academico;
	}
		
	public String getDataEmp() {
		return dataEmp;
	}

	public String getHoraEmp() {
		return horaEmp;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public boolean isStatusEmp() {
		return statusEmp;
	}

	public Academico getAcademico() {
		return academico;
	}
	
	public void addLivro(Livro l) {
		livros.add(l);		
	}

	public List<Livro> getLivros() {
		return livros;
	}
	
	
}