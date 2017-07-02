package com.github.restart1025.srs.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.restart1025.srs.domain.TranscriptEntity;
import com.github.restart1025.srs.pojo.TranscriptCatalog;
import com.github.restart1025.srs.service.TranscriptService;
@Service("transcriptService")
public class TranscriptServiceImpl implements TranscriptService {
	
	@Autowired
	private TranscriptCatalog transcript;
	
	@Override
	public List<Map<String,String>> queryTranscript(String ssn) 
	{
		List<Map<String,String>> result = new ArrayList<Map<String,String>>();
		ArrayList<TranscriptEntity> list = transcript.getMap().get(ssn);
		int size = list.size();
		for(int i = 0; i < size; i++){
			Map<String,String> map=new HashMap<String,String>();
			map.put("name", list.get(i).getSection().getCourse().getName());
			map.put("grade",String.valueOf(list.get(i).getGrade()));
			map.put("credits", String.valueOf(list.get(i).getSection().getCourse().getCredits()));
			map.put("time", list.get(i).getSection().getDayOfWeek()+" "+list.get(i).getSection().getTimeOfDay());
			result.add(map);
		}
		return result;
	}

}
