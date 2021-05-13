package tn.solixy.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.solixy.model.Salleattente;
@Repository
public interface ISalleattenteDao extends JpaRepository<Salleattente, Integer>{

}