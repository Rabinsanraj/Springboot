package com.Home.OldProject;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Home.OldProject.models.StudentDetails;

public interface OldDetailsRepository extends JpaRepository<StudentDetails,Integer>{
	
}