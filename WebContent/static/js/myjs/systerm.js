
function serch(){
	
	var data = $(".dropdown").val();
	var ID = $("#questionID").val();
	
	var check = [data,ID];
	
	alert(check);
	
		$.post(
			"searchByID",//服务器地址
			{list:check},
			function(result){//服务端处理完毕后的回调函数 List<Student> students， 加上@ResponseBody后， students实质是一个json数组的格式
				if(result!=null){
					$(".question").html(result.question);
					$("#answerA").attr("value",result.answerA);
					$("#answerB").attr("value",result.answerB);
					$("#answerC").attr("value",result.answerC);
					$("#answerD").attr("value",result.answerD);
					$("#answer").attr("value",result.answer);
				}else{
					alert("不存在该题目");
				}
				
			});		
};



function btn(){
	var data = $(".dropdown").val();
	var ID = $("#questionID").val();
	var question = $(".question").text();
	var answerA = $("#answerA").val();
	var answerB = $("#answerB").val();
	var answerC = $("#answerC").val();
	var answerD = $("#answerD").val();
	var answer = $("#answer").val();
	if(answer=='A'||answer=='B'||answer=='C'||answer=='D'){
		var result = [data,ID,question,answerA,answerB,answerC,answerD,answer];
		alert(data);
		
			$.post(
					"change",
					{list:result},
					function(data,textStatus,xhr){
						
						if(data==0){
							alert("修改失败");
						}
						alert("修改成功");
					}
					
			);
	}else{
		alert("正确答案应为A-D其中一个，请从新输入");
	}
	
	
	
}

