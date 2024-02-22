package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
	TeacherService ts;
	
	
	@PostMapping("/savedata")
	public String getdata(@RequestBody Teacher tc) {
		ts.register(tc);
		return "record saved";
	}
	

	@GetMapping("/display")
	public List<Teacher> getall() {
		List<Teacher>tt=ts.getallinfo();
		
		return tt;
	}
	
	@PutMapping("/update/{id}")
	public String update(@PathVariable int id, @RequestBody Teacher teacher) {
		ts.update(id,teacher);	
		return "record updated";
	}
	
	@GetMapping("/del/{id}")
	public String delete(@PathVariable int id) {
	 ts.deleteById(id);
		return "Record deleted";
	}

}
