package br.laab.askgo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class OpcaoEnquete {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Column(name="opcao_id")
	private Long id;
	
	private String descricao;
	
	@Temporal(TemporalType.DATE)
	private Date data;
	
	private int votos;
	
	@ManyToOne
	private Enquete enquetePai;
	@ManyToOne
	private Usuario criadorOpcao;
	
	
	 @ManyToMany
	    @JoinTable(name="votos_pessoas", joinColumns=
	    {@JoinColumn(name="opcao_id")}, inverseJoinColumns=
	      {@JoinColumn(name="usuario_id")})
	private List<Usuario> votantes = new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	public Enquete getEnquetePai() {
		return enquetePai;
	}
	public void setEnquetePai(Enquete enquetePai) {
		this.enquetePai = enquetePai;
	}
	public Usuario getCriadorOpcao() {
		return criadorOpcao;
	}
	public void setCriadorOpcao(Usuario criadorOpcao) {
		this.criadorOpcao = criadorOpcao;
	}
	public List<Usuario> getVotantes() {
		return votantes;
	}
	public void setVotantes(List<Usuario> votantes) {
		this.votantes = votantes;
	}
	
}
