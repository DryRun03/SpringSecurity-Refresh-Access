package io.refresh.access.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.refresh.access.entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {
	
	
}
