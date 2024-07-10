$(function() {

$("#receivername").blur(
		function() {
			$("#receivername_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#receivername").after("<span id='receivername_msg' style='color: red'>收件人姓名不能为空</span>");
			}
	});

$("#receiverphone").blur(
		function() {
			$("#receiverphone_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#receiverphone").after("<span id='receiverphone_msg' style='color: red'>收件人电话不能为空</span>");
			}
	});

$("#address").blur(
		function() {
			$("#address_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#address").after("<span id='address_msg' style='color: red'>收件人地址不能为空</span>");
			}
	});



});
