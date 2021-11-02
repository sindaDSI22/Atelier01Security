package com.sinda.users.service;

import com.sinda.users.entities.Role;
import com.sinda.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);

}
