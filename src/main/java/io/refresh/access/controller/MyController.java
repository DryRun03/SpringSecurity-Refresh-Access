package io.refresh.access.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.refresh.access.entity.RoleEntity;
import io.refresh.access.entity.UserEntity;
import io.refresh.accesss.service.RoleService;
import io.refresh.accesss.service.UserService;

@RestController
public class MyController {
	
	@Autowired UserService userService;
	@Autowired RoleService roleService;
	
	@PostMapping
	public ResponseEntity<UserEntity> saveUsers(@RequestBody UserEntity user) {
		return ResponseEntity.ok().body(userService.saveUsers(user));
	}
	
	@PostMapping
	public ResponseEntity<RoleEntity> saveRoles(@RequestBody RoleEntity roles){
		return ResponseEntity.ok().body(roleService.saveRole(roles));
	}
	
	@GetMapping
	public ResponseEntity<Long> getRolesById(@RequestBody Long id){
		return ResponseEntity.ok().body(roleService.getRoles(id));
	}
	
	@GetMapping 
	public ResponseEntity<Long> getUsesById(@RequestBody Long id){
		return ResponseEntity.ok().body(userService.getUsers(id));
	}
	
	@GetMapping
	public String homePage() {
		return "This is home page";
	}
	
	
}
