package tn.solixy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.solixy.Dao. ISalleattenteDao;
import tn.solixy.model.Salleattente;
@CrossOrigin("*")
@RestController
public class ServiceSecretaier {
	@Autowired
	private ISalleattenteDao daoe;
	
	public void setDaop(ISalleattenteDao daoe) { this.daoe= daoe;}
	
	@GetMapping("/listeSalleattente")
	public List<Salleattente> fct1(){
	return daoe.findAll();
	}

}
