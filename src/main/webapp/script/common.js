function syncAjax(url,data,dataType,callback) {
	$j.ajax({
		url : url,
		data : data,
		dataType : dataType,
		method : function(result) {
			if (result.status == 5000) {
				$.messager.alert('提示',result.msg,'error');
			} else {
				callback(result);
			}
		}
	});
}





