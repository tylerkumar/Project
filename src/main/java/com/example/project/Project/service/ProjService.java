package com.example.project.Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Project.entity.Projects;
import com.example.project.Project.repository.ProjRepository;

@Service
public class ProjService {
 
	@Autowired
	ProjRepository projRepository;
	
	
	
	public List<Projects>getAll(){
		return projRepository.getAll();
	}
	public String add(Projects project) {
		return projRepository.add(project);
	}
	public String edit(Projects project) {
		return projRepository.edit(project);
 	}
	public String delete(int projectId) {
		return projRepository.delete(projectId);
	}
	
	
	
}

