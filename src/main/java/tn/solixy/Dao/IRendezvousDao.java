package tn.solixy.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.solixy.model.Rendezvous;
@Repository
public interface IRendezvousDao extends JpaRepository<Rendezvous, Integer>{

}
