package com.lpu.unidirectional.onetomany;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.CascadeType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToMany;

@Entity
@Table(name="University")
public class University {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<ResearchPaper> researchPaper;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ResearchPaper> getResearchPaper() {
		return researchPaper;
	}

	public void setResearchPaper(List<ResearchPaper> researchPaper) {
		this.researchPaper = researchPaper;
	}
	
	
}
