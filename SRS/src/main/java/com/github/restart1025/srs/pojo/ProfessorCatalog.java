package com.github.restart1025.srs.pojo;

import java.util.ArrayList;
import java.util.List;

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
	
	private List<Professor> professorCatalog;
	
	public ProfessorCatalog() {
		professorCatalog = new ArrayList<Professor>();
	}
	
	@Autowired
	private ProfessorDao professorDao;
	public void setProfessorDao(ProfessorDao professorDao) {
		this.professorDao = professorDao;
	}
	
	/**
	 * 创建bean实例的时候执行加载数据方法
	 */
	@PostConstruct
	public void init()
	{
		this.professorCatalog = load();
	}
	
	@PreDestroy
	public void preDestroy(){
		
	}
	
	/**
	 * 加载数据库中数据
	 * @return
	 */
	private ArrayList<Professor> load() 
	{	
		return professorDao.load();
	}
	
	/**
	 * 添加教师
	 * @param professor
	 * @return
	 */
	public boolean addProfessor(Professor professor) 
	{ 
		boolean result=professorCatalog.add(professor);
		professorDao.insertProfessor(professor);
		return result;
	}
	/**
	 * 删除教师
	 * @param ssn
	 * @return
	 */
	public boolean deleteProfessor(String ssn) 
	{
		int size = professorCatalog.size();
		
		for(int i = 0; i < size; i++)
		{
			if(professorCatalog.get(i).getSsn().equals(ssn))
			{
				professorCatalog.remove(professorCatalog.get(i));
				professorDao.deleteProfessor(ssn);
				break;
			}
		}
		return true;
	}
	/**
	 * 修改教师资料
	 * @param professor
	 * @return
	 */
	public boolean updateProfessor(Professor professor) 
	{
		int size = professorCatalog.size();
		for(int i = 0; i < size; i++){
			if( professorCatalog.get(i).getSsn().equals( professor.getSsn() ) )
			{
				professorCatalog.remove(professorCatalog.get(i));
				professorCatalog.add(professor);
				break;
			}
		}
		professorDao.updateProfessor(professor);
		return true;
	}
	public List<Professor> getProfessorCatalog() {
		return professorCatalog;
	}


	




	
}
