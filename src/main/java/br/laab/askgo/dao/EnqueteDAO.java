package br.laab.askgo.dao;

import org.springframework.stereotype.Repository;

import br.laab.askgo.entities.Enquete;

@Repository
public class EnqueteDAO extends DAO<Enquete, Long> implements IEnqueteDAO{

}
