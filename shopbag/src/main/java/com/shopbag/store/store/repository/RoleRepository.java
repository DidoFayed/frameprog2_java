package com.shopbag.store.store.repository;

import org.springframework.data.repository.CrudRepository;

import com.shopbag.store.store.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	
	Role findByName(String name);

}
