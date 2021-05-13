package tn.solixy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.solixy.Dao.IPatientDao;
import tn.solixy.model.Patient;
@CrossOrigin("*")
@RestController
public class ServiceMedecin {
	@Autowired
	private IPatientDao daop;
	
	public void setDaop(IPatientDao daop) { this.daop = daop;}
	
	@GetMapping("/listePatient")
	public List<Patient> fct1(){
	return daop.findAll();
	}

}
