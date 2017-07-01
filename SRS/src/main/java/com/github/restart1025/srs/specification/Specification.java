package com.github.restart1025.srs.specification;

import com.github.restart1025.srs.domain.Section;
import com.github.restart1025.srs.domain.Student;

public interface Specification<T> {
	String validate(Student student, Section section);
}
