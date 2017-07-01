package com.github.restart1025.srs.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.restart1025.srs.mapper.TranscriptDao;

@Component
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class Transcript{
	private HashMap<String,ArrayList<TranscriptEntity>> map;
	public Transcript() {
		super();
		map=new HashMap<String,ArrayList<TranscriptEntity>>();
	}
	@PostConstruct
	public void init(){
		ArrayList<TranscriptEntity> list=load();
		//int size=list.size();
		HashMap<String,ArrayList<TranscriptEntity>> hashmap=new HashMap<String,ArrayList<TranscriptEntity>>();
		for(TranscriptEntity t:list){
			try {
				String ssn=t.getStudent().getSsn();
				if(hashmap.get(ssn)==null){
					ArrayList<TranscriptEntity> transcript=new ArrayList<TranscriptEntity>();
					transcript.add(t);
					hashmap.put(ssn, transcript);
				}else{
					hashmap.get(ssn).add(t);
				}
			}catch (Exception e){
				continue;
			}

		}
		this.map=hashmap;
	}
	@Autowired
	private TranscriptDao transcriptDao;
	private ArrayList<TranscriptEntity> load() {
		ArrayList<TranscriptEntity> list=transcriptDao.load();
		return list;
	}
	public HashMap<String, ArrayList<TranscriptEntity>> getMap() {
		return map;
	}
	
}
