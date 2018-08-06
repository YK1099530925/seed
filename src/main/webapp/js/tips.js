//添加错误提示
function addErrorTips(eleDiv, eleInput, text){
	$(eleDiv).find("i").remove();
	var i = "<i class='red'>" + text + "</i>";
	$(eleInput).after(i).addClass("borderColorRed").removeClass("borderColorGreen");
}
//添加正确提示
function addSuccessTips(eleDiv, eleInput, text){
	$(eleDiv).find("i").remove();
	var i1 = "<i class='green'>" + text + "</i>";
	$(eleInput).after(i1).addClass("borderColorGreen").removeClass("borderColorRed");
}