package com.zensar.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.training.bean.LoginUser;

@Repository
public interface LoginUserDAO extends JpaRepository<LoginUser, Integer>{

	LoginUser findByName(String name);
}
