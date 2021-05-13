package tn.solixy.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Medecin{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_med;
	private String nom_med ;
	private String prenom_med ;
	private String email_med ;
	private String specialite_med ;
	private String password_med ;
	public Medecin() {
		super();
	}
	public Medecin(Integer id_med, String nom_med, String prenom_md, String email_med, String specialite_med,
			String password_pat) {
		super();
		this.id_med = id_med;
		this.nom_med = nom_med;
		this.prenom_med = prenom_med;
		
		this.email_med = email_med;
		this.specialite_med = specialite_med;
		this.password_med = password_med;
	}
	public Integer getId_pat() {
		return id_med;
	}
	public void setId_med(Integer id_med) {
		this.id_med= id_med;
	}
	public String getNom_med() {
		return nom_med;
	}
	public void setNom_pat(String nom_med) {
		this.nom_med = nom_med;
	}
	public String getPrenom_med() {
		return prenom_med;
	}
	public void setPrenom_med(String prenom_med) {
		this.prenom_med = prenom_med;
	}

	public String getEmail_med() {
		return email_med;
	}
	public void setEmail_med(String email_med) {
		this.email_med = email_med;
	}
	public String getspecialite_med() {
		return specialite_med;
	}
	public void setspecialite_med(String specialite_med) {
		this.specialite_med = specialite_med;
	}
	public String getpassword_med() {
		return password_med;
	}
	public void setpassword_med(String password_med) {
		this.password_med = password_med;
	}
	
	
	
	

}
