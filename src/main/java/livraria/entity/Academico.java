package livraria.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Academico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String cpf;
	private String ra;
	private String endereco;
	private String telefone;
	
	@OneToMany
	private List<Reservar> reservas = new ArrayList();

	public Academico(String nome, String cpf, String ra, String endereco, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.ra = ra;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRa() {
		return ra;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public List<Reservar> getReservas() {
		return reservas;
	}
	
	public void addReservas(Reservar r) {
		reservas.add(r);		
	}
	
}