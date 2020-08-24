package com.prodev.onetomanydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodev.onetomanydemo.entity.comment;

@Repository
public interface commentRepository extends JpaRepository<comment, Long>{

}
