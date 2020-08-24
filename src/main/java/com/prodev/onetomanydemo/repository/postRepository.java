package com.prodev.onetomanydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodev.onetomanydemo.entity.post;
@Repository
public interface postRepository extends JpaRepository<post,Long>{

}
