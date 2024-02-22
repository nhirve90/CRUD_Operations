package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherDao implements TeacherService {

	@Autowired
	TeacherRepo tr;
	@Override
	public void register(Teacher t1) {
		// TODO Auto-generated method stub
      tr.save(t1);
	
	}
	@Override
	public List<Teacher> getallinfo() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}
	
	@Override
	public void update(int id,Teacher teacher) {
		// TODO Auto-generated method stub
		tr.save(teacher);
		
	}
	@Override
	public void deleteById(int id) {
		tr.deleteById(id);
	}
	
	

}
