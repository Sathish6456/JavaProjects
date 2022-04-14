package com.zensar.messageApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.messageApi.entity.ZensarUser;

public interface ZensarUserRepository extends JpaRepository<ZensarUser,Integer>
{
	ZensarUser findByUsername(String Username);
}
