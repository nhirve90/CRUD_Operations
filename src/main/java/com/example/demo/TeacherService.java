package com.example.demo;

import java.util.List;

public interface TeacherService {

	public void register(Teacher t1);
	
	List<Teacher>getallinfo();
	
	public void update(int id, Teacher teacher);
	
	public void deleteById(int id);


	
	
	

}
