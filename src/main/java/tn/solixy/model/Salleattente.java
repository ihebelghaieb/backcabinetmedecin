package tn.solixy.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Salleattente{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_sa;
	private String nom_sa ;
	private String capacite_sa ;
	
	
	public Salleattente() {
		super();
	}
	public Salleattente(Integer id_sa, String nom_sa, String capacite_sa) {
		super();
		this.id_sa = id_sa;
		this.nom_sa = nom_sa;
		this.capacite_sa = capacite_sa;
	
	}
	public Integer getId_sa() {
		return id_sa;
	}
	public void setId_sa(Integer id_sa) {
		this.id_sa = id_sa;
	}
	public String getNom_sa() {
		return nom_sa;
	}
	public void setNom_sa(String nom_sa) {
		this.nom_sa = nom_sa;
	}
	
	
	
	

}