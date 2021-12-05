package com.debatecontest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.debatecontest.model.Student;

@Service
public interface StudentService {
	public List<Student> findAll();

	public Student findById(int studentId);

	public void save(Student student);

	public void deleteById(int studentId);
}