package br.laab.askgo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="usuario_id")
	private Long id;
	
	@Column(name="nome_usuario",length=100)
	private String nome;
	
	@NotEmpty(message="{erro.login}")
	private String email;
	private String senha;
	
	@ManyToMany(mappedBy = "enqueteUsuarios")
	private List<Enquete> enquetes = new ArrayList<>();
	
	public List<Enquete> getEnquetes() {
		return enquetes;
	}
	public void setEnquetes(List<Enquete> enquetes) {
		this.enquetes = enquetes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String Nome) {
		nome = Nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
