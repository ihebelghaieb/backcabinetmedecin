package tn.solixy.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.solixy.model.Secretaier;
@Repository
public interface ISecretaierDao extends JpaRepository<Secretaier, Integer>{

}