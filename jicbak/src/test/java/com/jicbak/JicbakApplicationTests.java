package com.jicbak;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.jicbak.DTO.BoardDTO;
import com.jicbak.DTO.UserDTO;
import com.jicbak.service.BoardService;
import com.jicbak.service.UserService;

@ExtendWith(SpringExtension.class)
/* @SpringBootTest(classes = JicbakApplication.class) */
class JicbakApplicationTests {
	
	@Autowired
	private UserService uService;
	@Autowired
	private BoardService bService;
	
	@Test
	public void userTest() {
		UserDTO user = new UserDTO();
		user.setUserId("test2");
		user.setUserPw("123123");
		user.setUserName("test_Account2");
		user.setUserGender("여");
		user.setUserEmail("test2@test.com");
		uService.join(user);
		System.out.println(uService.getUser("test2"));
        System.out.println("로그인 결과:"+uService.login("test2", "test2"));
	}
	
	@Test
	public void boardTest() {
		BoardDTO board = new BoardDTO();
		board.setBoardId(2);
		board.setBoardTitle("이것은 test중입니다.");
		board.setBoardContent("test로 입력되는 본문입니다.");
		bService.write(board);
		
		for(BoardDTO b : bService.getBoardList()) {
			System.out.println(b);
		}
	}
	/*
	 * @Test void contextLoads() { }
	 */

}
