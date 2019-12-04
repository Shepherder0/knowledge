function regist(){
	
	$.post(
			"regist",
			'Integer',
			function(result){
				if(i==1){
					alert("注册成功");
					location.href = "index";
				}else{
					
				}
			}
	)
}

