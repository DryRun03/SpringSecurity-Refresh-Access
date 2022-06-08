package io.refresh.accesss.service;

import org.springframework.beans.factory.annotation.Autowired;

import io.refresh.access.entity.RoleEntity;
import io.refresh.access.repository.RoleRepo;

public class RoleService {
	
	@Autowired RoleRepo roleRepo;
	
	public RoleEntity saveRole(RoleEntity roles) {
		return roleRepo.save(roles);
	}
	
	@SuppressWarnings("deprecation")
	public Long getRoles(Long id) {
		return roleRepo.getById(id).getId();
	}
}
