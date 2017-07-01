package com.github.restart1025.srs.service;

import com.github.restart1025.srs.domain.Student;

public interface LoginService {
	/**
	 * 学生登陆
	 * @param ssn
	 * @param password
	 * @return
	 */
	Student studentLogin(String ssn, String password);
}
