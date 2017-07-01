package com.github.restart1025.srs.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.restart1025.srs.domain.Professor;
import com.github.restart1025.srs.mapper.ProfessorDao;

@Component
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class ProfessorCatalog{
	private ArrayList<Professor> professorCatalog;
	public ProfessorCatalog() {
		professorCatalog = new ArrayList<Professor>();
	}
	@Autowired
	private ProfessorDao professorDao;
	public void setProfessorDao(ProfessorDao professorDao) {
		this.professorDao = professorDao;
	}
	/*bean创建实例，注入依赖关系之后执行init方法*/
	@PostConstruct
	public void init(){
		this.professorCatalog=load();
	}
	@PreDestroy
	public void preDestroy(){
		//在此执行批量更新数据库
		
	}
	/*加载数据库中数据*/
	private ArrayList<Professor> load() {	
		ArrayList<Professor> list=professorDao.load();
		return list;
	}
	/*添加教师*/
	public boolean addProfessor(Professor professor) { 
		boolean result=professorCatalog.add(professor);
		professorDao.insertProfessor(professor);
		return result;
	}
	/*删除教师*/
	public boolean deleteProfessor(String ssn) {
		// TODO Auto-generated method stub
		int size=professorCatalog.size();
		for(int i=0;i<size;i++){
			if(professorCatalog.get(i).getSsn().equals(ssn)){
				professorCatalog.remove(professorCatalog.get(i));
				professorDao.deleteProfessor(ssn);
				break;
			}
		}
		return true;
	}
	/*修改教师资料*/
	public boolean updateProfessor(Professor professor) {
		// TODO Auto-generated method stub
		int size=professorCatalog.size();
		for(int i=0;i<size;i++){
			if(professorCatalog.get(i).getSsn().equals(professor.getSsn())){
				professorCatalog.remove(professorCatalog.get(i));
				professorCatalog.add(professor);
				break;
			}
		}
		professorDao.updateProfessor(professor);
		return true;
	}
	public ArrayList<Professor> getProfessorCatalog() {
		return professorCatalog;
	}


	




	
}
