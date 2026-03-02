package com.lpu.unidirectional.onetomany;


import jakarta.persistence.*;
import java.util.List;

@Entity
public class Playlist {

    @Id
    private Long id;

    private String title;

    @OneToMany
    @JoinColumn(name="playlist_id")
    private List<Song> songs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

    
}
