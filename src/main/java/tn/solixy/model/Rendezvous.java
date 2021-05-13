package tn.solixy.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Rendezvous{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_rv ;
	private String dateres_rv ;
	private String daterdv_rv ;
	private Integer heurerdv_rv;
	private Integer heure_rv;
	
	public Rendezvous() {
		super();
	}
	public  Rendezvous(Integer id_rv, String dateres_rv, String daterdv_rv, Integer heurerdv_rv) {
		super();
		this.id_rv = id_rv;
		this.dateres_rv = dateres_rv;
		this.daterdv_rv = daterdv_rv;
		this.heurerdv_rv = heurerdv_rv;
		
	}
	public Integer getId_sv() {
		return id_rv;
	}
	public void setId_rv(Integer id_rv) {
		this.id_rv = id_rv;
	}
	public String getdateres_rv() {
		return dateres_rv;
	}
	public void setdaterdv_rv(String daterdv_rv) {
		this.daterdv_rv= daterdv_rv;
	}
	public Integer getheure_rv() {
		return getheure_rv();
	}
	public void setheure_rv(Integer heure_rv) {
		this.heure_rv = heure_rv;
	}
	
	
	
	
	

}
