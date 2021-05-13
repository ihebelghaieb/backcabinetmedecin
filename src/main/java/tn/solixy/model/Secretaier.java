package tn.solixy.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Secretaier{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_sec ;
	private String nom_sec ;
	private String prenom_sec ;
	private String password_sec;
	
	public Secretaier() {
		super();
	}
	public Secretaier(Integer id_pat, String nom_pat, String prenom_pat, String password_sec) {
		super();
		this.id_sec = id_sec;
		this.nom_sec = nom_sec;
		this.prenom_sec = prenom_sec;
		this.password_sec = password_sec;
		
	}
	public Integer getId_sec() {
		return id_sec;
	}
	public void setId_sec(Integer id_sec) {
		this.id_sec = id_sec;
	}
	public String getNom_sec() {
		return nom_sec;
	}
	public void setNom_sec(String nom_sec) {
		this.nom_sec = nom_sec;
	}
	public String getPrenom_sec() {
		return prenom_sec;
	}
	public void setPrenom_sec(String prenom_sec) {
		this.prenom_sec = prenom_sec;
	}
	public String getpassword_sec() {
		return password_sec;
	}
	public void setpassword_sec(String password_sec) {
		this.password_sec = password_sec;
	}
	
	
	
	

}
