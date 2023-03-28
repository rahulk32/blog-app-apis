package com.rahul.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
