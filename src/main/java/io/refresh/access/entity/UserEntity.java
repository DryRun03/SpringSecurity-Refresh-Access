package io.refresh.access.entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserEntity {
	@Id
	private Long id;
	private String name;
	private String username;
//	private Collection<RoleEntity> roles = new ArrayList<RoleEntity>(); 
}
