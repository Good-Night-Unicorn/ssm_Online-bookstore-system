$(function() {

$("#bookname").blur(
		function() {
			$("#bookname_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#bookname").after("<span id='bookname_msg' style='color: red'>图书名称不能为空</span>");
			}
	});

$("#image").blur(
		function() {
			$("#image_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#image").after("<span id='image_msg' style='color: red'>图片不能为空</span>");
			}
	});

$("#cateid").blur(
		function() {
			$("#cateid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#cateid").after("<span id='cateid_msg' style='color: red'>图书类型不能为空</span>");
			}
	});

$("#price").blur(
		function() {
			$("#price_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#price").after("<span id='price_msg' style='color: red'>票价不能为空</span>");
			}
	});





$("#contents").blur(
		function() {
			$("#contents_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#contents").after("<span id='contents_msg' style='color: red'>图书介绍不能为空</span>");
			}
	});







$('#sub').click(function(){
var bookname = $("#bookname").val();
var image = $("#image").val();
var cateid = $("#cateid").val();
var price = $("#price").val();
var contents = $("#contents").val();
$("#bookname_msg").empty();
$("#image_msg").empty();
$("#cateid_msg").empty();
$("#price_msg").empty();
$("#contents_msg").empty();
if (bookname == "" || bookname == null) {
	$("#bookname").after("<span id='bookname_msg' style='color: red'>图书名称不能为空</span>");
	return false;
}
if (image == "" || image == null) {
	$("#image").after("<span id='image_msg' style='color: red'>图片不能为空</span>");
	return false;
}
if (cateid == "" || cateid == null) {
	$("#cateid").after("<span id='cateid_msg' style='color: red'>图书类型不能为空</span>");
	return false;
}
if (price == "" || price == null) {
	$("#price").after("<span id='price_msg' style='color: red'>价格不能为空</span>");
	return false;
}

if (contents == "" || contents == null) {
	$("#contents").after("<span id='contents_msg' style='color: red'>图书介绍不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#bookname_msg").empty();
$("#image_msg").empty();
$("#cateid_msg").empty();
$("#price_msg").empty();

$("#contents_msg").empty();
});


});
