package it.polito.tdp.corsi.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {

	private CorsoDAO corsoDao;
	
	public Model() {
		corsoDao = new CorsoDAO();
	}
	
	public List<Corso> getCorsiByPeriodo(Integer id) {
		return corsoDao.getCorsiByPeriodo(id);
	}
	
	public LinkedHashMap<Corso, Integer> getIscrittiByPeriodo(Integer pd) {
		return corsoDao.getIscrittibyPeriodo(pd);
	}
}
