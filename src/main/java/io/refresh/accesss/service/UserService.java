package io.refresh.accesss.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.refresh.access.entity.UserEntity;
import io.refresh.access.repository.UserRepo;

@Service @Transactional
public class UserService {
	@Autowired UserRepo userRepo;
	
	public UserEntity saveUsers(UserEntity user) {
		return userRepo.save(user);
	}
	
	@SuppressWarnings("deprecation")
	public Long getUsers(Long userId) {
		return userRepo.getById(userId).getId();
	}
	
}
