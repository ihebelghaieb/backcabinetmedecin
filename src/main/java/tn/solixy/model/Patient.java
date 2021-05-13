package tn.solixy.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pat ;
	private String nom_pat ;
	private String prenom_pat ;
	private Date date_pat ;
	private String email_pat ;
	private String tel_pat ;
	private String adresse_pat ;
	private String username;
	private String password;
	public Patient() {
		super();
	}
	public Patient(Integer id_pat, String nom_pat, String prenom_pat, Date date_pat, String email_pat, String tel_pat,
			String adresse_pat,String username, String password) {
		super();
		this.id_pat = id_pat;
		this.nom_pat = nom_pat;
		this.prenom_pat = prenom_pat;
		this.date_pat = date_pat;
		this.email_pat = email_pat;
		this.tel_pat = tel_pat;
		this.adresse_pat = adresse_pat;
		this.username = username;
		this.password = password;
	}
	public Integer getId_pat() {
		return id_pat;
	}
	public void setId_pat(Integer id_pat) {
		this.id_pat = id_pat;
	}
	public String getNom_pat() {
		return nom_pat;
	}
	public void setNom_pat(String nom_pat) {
		this.nom_pat = nom_pat;
	}
	public String getPrenom_pat() {
		return prenom_pat;
	}
	public void setPrenom_pat(String prenom_pat) {
		this.prenom_pat = prenom_pat;
	}
	public Date getDate_pat() {
		return date_pat;
	}
	public void setDate_pat(Date date_pat) {
		this.date_pat = date_pat;
	}
	public String getEmail_pat() {
		return email_pat;
	}
	public void setEmail_pat(String email_pat) {
		this.email_pat = email_pat;
	}
	public String getTel_pat() {
		return tel_pat;
	}
	public void setTel_pat(String tel_pat) {
		this.tel_pat = tel_pat;
	}
	public String getAdresse_pat() {
		return adresse_pat;
	}
	public void setAdresse_pat(String adresse_pat) {
		this.adresse_pat = adresse_pat;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}