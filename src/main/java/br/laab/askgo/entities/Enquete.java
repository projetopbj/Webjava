package br.laab.askgo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "enquete")
public class Enquete {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="enquete_id")
	private Long id;
	
	private String titulo;
	private String descricao;
	@Temporal(TemporalType.DATE)
	private Date dataInicio;
	@Temporal(TemporalType.DATE)
	private Date dataFim;
	private boolean estado;
	
	@OneToOne
	private OpcaoEnquete Vencedor;
	
	
	@OneToMany(mappedBy="enquetePai")
	private List<OpcaoEnquete> opcoesEnquete;
	@ManyToOne
	private Usuario criadorEnquete;
	
	
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "enquete_usuario",
    joinColumns = @JoinColumn(name = "enquete_id"),
    inverseJoinColumns = @JoinColumn(name = "usuario_id")
    		)
	private List<Usuario> enqueteUsuarios;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public OpcaoEnquete getVencedor() {
		return Vencedor;
	}
	public void setVencedor(OpcaoEnquete vencedor) {
		Vencedor = vencedor;
	}
	public List<OpcaoEnquete> getOpcoesEnquete() {
		return opcoesEnquete;
	}
	public void setOpcoesEnquete(List<OpcaoEnquete> opcoesEnquete) {
		this.opcoesEnquete = opcoesEnquete;
	}
	public Usuario getCriadorEnquete() {
		return criadorEnquete;
	}
	public void setCriadorEnquete(Usuario criadorEnquete) {
		this.criadorEnquete = criadorEnquete;
	}
	public List<Usuario> getEnqueteUsuarios() {
		return enqueteUsuarios;
	}
	public void setEnqueteUsuarios(List<Usuario> enqueteUsuarios) {
		this.enqueteUsuarios = enqueteUsuarios;
	}


}
	
