package tn.solixy.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.solixy.model.Patient;
@Repository
public interface IUserDao extends JpaRepository<Patient, Integer>{
	
	public List<Patient> findByUsernameAndPassword(String username,String password);
	public Patient findByUsername(String username);

}