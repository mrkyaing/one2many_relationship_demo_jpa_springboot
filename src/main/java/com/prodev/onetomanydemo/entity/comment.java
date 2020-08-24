package com.prodev.onetomanydemo.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="comment")
public class comment implements Serializable{
	
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long commentId;
private String text;
public comment(String text) {
	super();
	this.text = text;
}
public long getComentId() {
	return commentId;
}
public void setComentId(long comentId) {
	this.commentId = comentId;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}

}
