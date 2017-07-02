package com.github.restart1025.srs.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.github.restart1025.srs.domain.Student;
import com.github.restart1025.srs.service.TranscriptService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 对成绩单进行相关操作
 */
@Controller
public class TranscriptController {
	
	@Autowired
	private TranscriptService transcriptService;
	
	
	@RequestMapping(value="queryTranscript")
	@ResponseBody
	public Object queryTranscript(HttpSession session)
	{
		Student student = (Student) session.getAttribute("student");
		
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		
		list = transcriptService.queryTranscript(student.getSsn());
		
		return list;
	}
	
}
