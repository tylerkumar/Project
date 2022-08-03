package com.example.project.Project.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.project.Project.entity.Projects;

@Repository
public class ProjRepository {
public List<Projects> proj= new ArrayList<Projects>();

public List<Projects> getAll() {
	
	return proj;
}

public String add(Projects project) {
	proj.add(project);
	return "Added Sucessfully";
}

public String edit(Projects project) {
	proj.stream().filter(e ->e.getProjectId()==project.getProjectId()).forEach(e->{
		e.setAddress(project.getAddress());
		e.setName(project.getName());
	});
	return "Updated Sucessfully";
}

public String delete(int projectId) {
	proj.remove(projectId-1);
	return "Deleted";
}




}
