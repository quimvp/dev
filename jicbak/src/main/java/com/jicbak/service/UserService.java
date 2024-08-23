package com.jicbak.service;

import java.util.List;

import com.jicbak.DTO.UserDTO;

public interface UserService {
	public boolean login (String userId, String userPw);
	public int join (UserDTO user);
	public void modify (UserDTO user);
	public void withdraw (String userId);
	public UserDTO getUser(String userId);
	public List<UserDTO> getUserList();
}
