package com.example.project.Project;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Project.entity.Projects;
import com.example.project.Project.service.ProjService;


@RestController
@RequestMapping("/proj")
public class ProjectController {

	@Autowired
	 ProjService projService;
	
	
	
	@GetMapping("/get")
	public List<Projects>getAll(){
		return projService.getAll();
	}
	@PostMapping("/add")
	public String getAll(@RequestBody Projects project){
		return projService.add(project);
	}
	@PutMapping("/edit")
	public String edit(@RequestBody Projects project){
		return projService.edit(project);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam int projectId){
		return projService.delete(projectId);
	}
}

