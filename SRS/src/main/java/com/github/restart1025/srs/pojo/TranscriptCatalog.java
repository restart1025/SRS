package com.github.restart1025.srs.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.restart1025.srs.domain.TranscriptEntity;
import com.github.restart1025.srs.mapper.TranscriptDao;

@Component
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class TranscriptCatalog{
	
	private Map<String, ArrayList<TranscriptEntity>> map;
	
	public TranscriptCatalog() {
		super();
		map=new HashMap<String, ArrayList<TranscriptEntity>>();
	}
	
	@PostConstruct
	public void init(){
		
		List<TranscriptEntity> list = load();
		
		for(TranscriptEntity t:list)
		{
			try {
				String ssn = t.getStudent().getSsn();
				
				if( map.get(ssn) == null )
				{
					
					ArrayList<TranscriptEntity> transcript = new ArrayList<TranscriptEntity>();
					transcript.add(t);
					map.put( ssn, transcript );
					
				}else{
					
					map.get(ssn).add(t);
					
				}
			}catch (Exception e){
				continue;
			}

		}
	}

	@Autowired
	private TranscriptDao transcriptDao;
	
	private ArrayList<TranscriptEntity> load() 
	{
		return transcriptDao.load();
	}
	
	public Map<String, ArrayList<TranscriptEntity>> getMap() {
		return map;
	}
	
}
