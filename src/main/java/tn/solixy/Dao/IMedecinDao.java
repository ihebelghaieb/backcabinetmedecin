package tn.solixy.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.solixy.model.Medecin;
@Repository
public interface IMedecinDao extends JpaRepository<Medecin, Integer>{

}