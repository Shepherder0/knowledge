$(document).ready(function(){
		$.post(
			"medicine",//服务器地址
			function(result){//服务端处理完毕后的回调函数 List<Student> students， 加上@ResponseBody后， students实质是一个json数组的格式
				for(var i=0;i<result.length ;i++){
					var addDIV = $('<div style="margin: auto;" class="demo-list clear">'
							+"<ul style='width:830px;'>"
							+"<li><lable style='text-align: left;font-size: 25px;'>"
							+(i+1)
							+".&nbsp;&nbsp;</lable>"
							+"<label style='text-align: left;font-size: 24px;'>"+result[i].question+"</label><br /><br />"
							+"</li>"
							+"<li>"
								+"<input type='radio' id='input' name='demo-radio" 
								+(i+1)
								+"' value='A'>"
								+"<label for='input'>"+result[i].answerA+"</label>"
							+"</li>"
							+"<li>"
								+"<input type='radio' id='input' name='demo-radio" 
								+(i+1)
								+"' value='B'>"
								+"<label for='input'>"+result[i].answerB+"</label>"
							+"</li>"
							+"<li>"
								+"<input type='radio' id='input' name='demo-radio" 
								+(i+1)
								+"' value='C'>"
								+"<label for='input'>"+result[i].answerC+"</label>"
							+"</li>"
							+"<li>"
								+"<input type='radio' id='input' name='demo-radio" 
								+(i+1)
								+"' value='D'>"
								+"<label for='input'>"+result[i].answerD+"</label>"
							+"</li>"
							+"</ul>"
							+"</div>"
							+'</br>');
					$(".demo").append(addDIV);
					
						}
				
				A();
			
					}
				);		
	});


function A(){
	  var callbacks_list = $('.demo-callbacks ul');
	  $('.demo-list input').on('ifCreated ifClicked ifChanged ifChecked ifUnchecked ifDisabled ifEnabled ifDestroyed', function(event){
	    callbacks_list.prepend('<li><span>#' + this.id + '</span> is ' + event.type.replace('if', '').toLowerCase() + '</li>');
	  }).iCheck({
	    checkboxClass: 'icheckbox_square-blue',
	    radioClass: 'iradio_square-blue',
	    increaseArea: '20%'
	  });
};

$("#submit").click(function(){

	alert("1111111111");
	//获取选择的选项
	var val1 = $('input:radio[name="demo-radio1"]:checked').val();
	var val2 = $('input:radio[name="demo-radio2"]:checked').val();
	var val3 = $('input:radio[name="demo-radio3"]:checked').val();
	var val4 = $('input:radio[name="demo-radio4"]:checked').val();
	var val5 = $('input:radio[name="demo-radio5"]:checked').val();
	var val6 = $('input:radio[name="demo-radio6"]:checked').val();
	var val7 = $('input:radio[name="demo-radio7"]:checked').val();
	var val8 = $('input:radio[name="demo-radio8"]:checked').val();
	var val9 = $('input:radio[name="demo-radio9"]:checked').val();
	var val10 = $('input:radio[name="demo-radio10"]:checked').val();
	var result = [val1,val2,val3,val4,val5,val6,val7,val8,val9,val10];
	if(result==null){
		alert("请做题");
	}else{
//		$.ajax({
//			type:"POST",
//			url:"medicineResult",
//			dataType:"json",
//			data:{list:result},
//	        success :function(data) {
//	        	
//	        	alert(data);
//
//	        }
//			
//		})
		$.post(
				'medicineResult',
				{list:result},
				function(data,textStatus,xhr){
					window.location.href="meResult?data="+data;
				}
		);
	}
	
})

