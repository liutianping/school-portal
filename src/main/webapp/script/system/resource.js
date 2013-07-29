$j(document).ready(function(){
	var parentId = [];
	$j.post('/system/resource/loadParentResourceIds.htm',function(res){
		if (res.data.length == 0) {
			 $j("#parentId").attr("disabled","disabled");
		} else {
			
		}
	});
	
});

$j('#addResourceBtn').click(function(){
	$j('#resourceForm').form('clear');
	$j('#addResource').dialog('open');
});

$j('#saveResource').click(function(){
	$j('#resourceForm').form('submit',{
		url : '/system/resource/addResource.htm',
		success : function(result) {
			if (result.status == 1000) {
				 $j('#addResource').dialog('close');
				  $j.messager.alert('提示',result.data);
				  $j('#resourceDg').datagrid('reload');
			}
		}
	})
});

