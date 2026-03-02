package com.lpu.important;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import java.time.LocalDateTime;

@Entity
@Table(name="book_table")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="book_name", unique=true,nullable=false)
	private String name;
	
	@Column(updatable=false)
	private String author;
	
	@CreationTimestamp
	private LocalDateTime created_dateTime;
	
	@UpdateTimestamp
	private LocalDateTime updated_dateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDateTime getCreated_dateTime() {
		return created_dateTime;
	}

	public void setCreated_dateTime(LocalDateTime created_dateTime) {
		this.created_dateTime = created_dateTime;
	}

	public LocalDateTime getUpdated_dateTime() {
		return updated_dateTime;
	}

	public void setUpdated_dateTime(LocalDateTime updated_dateTime) {
		this.updated_dateTime = updated_dateTime;
	}
	
	
}
