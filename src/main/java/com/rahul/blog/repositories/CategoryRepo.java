package com.rahul.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
