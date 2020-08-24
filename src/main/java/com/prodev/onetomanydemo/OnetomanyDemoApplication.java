package com.prodev.onetomanydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prodev.onetomanydemo.entity.comment;
import com.prodev.onetomanydemo.entity.post;
import com.prodev.onetomanydemo.repository.commentRepository;
import com.prodev.onetomanydemo.repository.postRepository;

@SpringBootApplication
public class OnetomanyDemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OnetomanyDemoApplication.class, args);
	}

	@Autowired 
	postRepository postRepository;
	@Autowired
	commentRepository commentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		post p=new post("Java","Java is Programming Language");
		
		comment c1=new comment("secure");
		comment c2=new comment("easy to learn");
		comment c3=new comment("platform-inpedencance");
		comment c4=new comment("robust");		
		p.getCommentsList().add(c1);
		p.getCommentsList().add(c2);
		p.getCommentsList().add(c3);
		p.getCommentsList().add(c4);
		
		postRepository.save(p);
	}

}
