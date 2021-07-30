package com.neosoft.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.app.entity.ERole;
import com.neosoft.app.entity.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {
	Optional<Role> findByName(ERole name);

}
