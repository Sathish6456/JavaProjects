package com.zensar.olx.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.olx.bean.Category;
import com.zensar.olx.db.CategoryDAO;

@Service
public class CategoryService {
	
	@Autowired
	CategoryDAO dao;
	
	
	public Category addCategory(Category category) {
		return this.dao.save(category);
	}
	
	
	public List<Category> getAllCatagories() {
		return this.dao.findAll();
	}
	
	public Category findCategory(int id) {
		Optional<Category> optional;
		optional=this.dao.findById(id);
		if(optional.isPresent())
			return optional.get();
		else
			return null;
	}
}
