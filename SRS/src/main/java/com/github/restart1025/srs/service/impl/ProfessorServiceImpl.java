package com.github.restart1025.srs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.restart1025.srs.domain.Professor;
import com.github.restart1025.srs.pojo.ProfessorCatalog;
import com.github.restart1025.srs.service.ProfessorService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("professorService")
public class ProfessorServiceImpl implements ProfessorService {
	
	@Autowired
	private ProfessorCatalog professorCatlog;
	
	@Override
	public boolean addProfessor(Professor professor) {
		return professorCatlog.addProfessor(professor);
	}
	@Override
	public boolean deleteProfessor(String ssn) {
		boolean result=professorCatlog.deleteProfessor(ssn);
		return result;
	}
	@Override
	public List<Professor> queryProfessor() {
		return professorCatlog.getProfessorCatalog();
	}
	@Override
	public boolean updateProfessor(Professor professor) {
		boolean result=professorCatlog.updateProfessor(professor);
		return result;
	}
 
	
}
