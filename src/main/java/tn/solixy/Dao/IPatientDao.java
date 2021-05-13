package tn.solixy.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.solixy.model.Patient;
@Repository
public interface IPatientDao extends JpaRepository<Patient, Integer>{

}
