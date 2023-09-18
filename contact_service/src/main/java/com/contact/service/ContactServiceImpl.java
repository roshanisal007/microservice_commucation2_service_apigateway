package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
@Service
public class ContactServiceImpl implements ContactService  {
	
	List<Contact> list=List.of(
			new Contact(1L,"rohan@gmail.com","Rohan",1111L),
			new Contact(2L,"Swara@gmail.com","Swara",1111L),
			new Contact(3L,"maya@gmail.com","Maya",1112L),
			new Contact(4L,"gita@gmail.com","Gita",1113L)
			);

	@Override
	public List<Contact> getContactOfUser(Long userId) {
		
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
