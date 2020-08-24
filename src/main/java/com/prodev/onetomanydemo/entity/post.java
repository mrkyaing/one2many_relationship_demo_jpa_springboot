package com.prodev.onetomanydemo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.Id;
@Entity
@Table(name="post")
public class post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long postId;
	private String title,name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_postId",referencedColumnName = "postId")
	List<comment> commentsList=new ArrayList<>();

	public post(String title, String name) {
		super();
		this.title = title;
		this.name = name;
	}

	public long getPostId() {
		return postId;
	}

	public void setPostId(long postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<comment> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<comment> commentsList) {
		this.commentsList = commentsList;
	}
	
	
}
