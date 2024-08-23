package com.jicbak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jicbak.DAO.UserMapper;
import com.jicbak.DTO.UserDTO;

@Service
public class UserServicelmpl implements UserService{
	@Autowired
	private UserMapper uMapper;
	
	@Override
	public boolean login (String userId, String UserPw) {
		UserDTO user = uMapper.selectOneUser(userId);
		
		if (user != null) {
			if (user.getUserPw().equals(UserPw)) {
				return true;
			}
		}return false;
	}
	
	@Override
	public int join (UserDTO user) {
		if(user.getUserId() != null) {
			if(uMapper.selectOneUser(user.getUserId()) == null) {
				uMapper.insertUser(user);
				return 1; //회원가입 완료
			} else {
				return 2; //중복된 ID존재
			}
		} return 3; //입력값 NULL
	}
	
	@Override
	public void modify(UserDTO user) {
		uMapper.updateUser(user);
	}
	
	@Override
	public void withdraw(String userId) {
		uMapper.deleteUser(userId);
	}
	
	@Override
	public UserDTO getUser(String userId) {
		return uMapper.selectOneUser(userId);
	}
	
	@Override
	public List<UserDTO> getUserList(){
		return uMapper.selectAllUser();
	}
}
