package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.Entity.User;
@Service
public class UserServiceImpl implements UserService {

	List<User> list=List.of(
			new User(1111L,"Roshan Isal","995542020"),
			new User(1112L,"Kayra Isal","995542520"),
			new User(1113L,"Kirti Isal","995544320")
			);
	@Override
	public User getUser(Long id) {
		
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}
	
	

}
