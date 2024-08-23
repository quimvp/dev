function submit_button(){ //singup
	const userId = $("#userId").val();
	const userName = $("#userName").val();
	const userEmail = $("#userEmail").val();
	const userGender = $("#userGender").val();
	const userPw = $("#userPw").val();
	const userPwCheck = $("#userPwCheck").val();
	
	let singList = [userId, userName, userEmail, userGender, userPw, userPwCheck];
	
	var result = nullCheck(singList);
	
	if(result == 0){
		return;
	}
	
	if( userPw != userPwCheck){
		alert("확인 비밀번호가 일치하지 않습니다.");
		return;
	}
	
	$.ajax({
		type: 'POST',
		url:'/signup',
		data : {
			'userId' : userId,
			'userName' : userName,
			'userEmail' : userEmail,
			'userGender' : userGender,
			'userPw' : userPw
		},		
		success : function(result) {
			if(result == 1){
				alert("회원가입이 완료되었습니다.");
			}else if(result == 2){
				alert("중복된 아이디가 존재합니다.");
			}
		},
		error:function(error){
			alert("통신오류:", error);
		}
	});
}

function submit_login(){
	const userId = $("#userId").val();
	const userPw = $("#userPw").val();
	
	const loginList = [userId, userPw];
	var result = nullCheck(loginList);
	
	if(result == 0){
			return;
		}
	
	$.ajax({
		type: 'POST',
		url:'/login',
		data : {
			'userId' : userId,
			'userPw' : userPw
		},
		success : function(result) {
			if(result){
				getLoginSession(userId);
				location.href="/";
			}
			else
				alert("아이디와 비밀번호를 확인해주세요.");
		},
		error : function(error){
			alert(error,"로그인 중 오류가 발생하였습니다.");
		}
	});
}

//로그인 세션 생성
function getLoginSession(userId){
	$.ajax({
		type: 'POST',
			url:'/getLoginSession',
			data : {
				'userId' : userId,
			},
			success : function(userName){
				sessionStorage.setItem("userName", userName);
			},
			error : function(error){
				alert(error,"로그인 중 오류가 발생하였습니다.");
			}
	});
}

function nullCheck(list){
	
	for(var i = 0; i < list.length; i++){ //입력하지 않은 칸 확인
		var singData = list[i];
		if(singData == null || singData == ""){
			alert("모든 칸에 입력해주십시오.");
			return 0;
		}
		
		const listLen = singData.length;
		
		for(var j = 0; j < listLen; j++){ //문자열 안의 공백 확인
			if(singData.charAt(j) == "" || singData.charAt(j) == " "){
				alert("공백문자를 포함하실 수 없습니다.");
				return 0;
			}
		}
	}
}