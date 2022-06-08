package io.refresh.access.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.refresh.access.entity.RoleEntity;

@Repository
public interface RoleRepo extends JpaRepository<RoleEntity, Long> {
	
}
