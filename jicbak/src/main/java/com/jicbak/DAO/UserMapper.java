package com.jicbak.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jicbak.DTO.UserDTO;

public interface UserMapper {
	public void insertUser (UserDTO user);
	public void updateUser (UserDTO user);
	public void deleteUser (String userId);
	public UserDTO selectOneUser (String userId);
	public List<UserDTO> selectAllUser();

}
