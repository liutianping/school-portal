$j('#addUserBtn').click(function() {
	$j('#userForm').form('clear');
	$j('#addUser').dialog('open');
});


//TODO 分页参数设置
/*var pager = $j('#userDg').datagrid('getPager');
pager.pagination({
	pageSize : 10,
	pageList : [10,20,30,40,50,100]
});
*/

$j('#userDg').datagrid({
	onDblClickRow : function(rowIndex, rowData){
    	$j('#addUser').dialog('open');
    	for (var key in rowData) {
    		$j('#userForm').form('clear');
    		var formAttr = "#userForm " + "#" +key;
    		$j(formAttr).attr("value",rowData[key]);
    	}
    }
});

$j('#editUserBtn').click(function(){
	var selectRow = $j('#userDg').datagrid('getSelections');
	if (selectRow.length > 0) {
		$j('#addUser').dialog({'title' : '用户修改'});
		$j('#addUser').dialog('open');
		var rowObj = selectRow[0];
		for (var key in rowObj) {
			$j('#userForm').form('clear');
			var formAttr = "#userForm " + "#" +key;
			$j(formAttr).attr("value",rowObj[key]);
		}
	} else {
		$j.messager.alert('提示','请选中要更新的记录!');
	}
	
});

$j('#removeUserBtn').click(function(){
	var selectRow = $j('#userDg').datagrid('getSelections');
	if (selectRow.length > 0) {
		$j.messager.confirm('确认','您是否要删除当前选中的记录?',function(r){
			if (r) {
				var userId = selectRow[0].userId;
				$j.ajax({
					url : '/system/user/removeUser.htm',
					data : {'userId' : userId},
					dataType : 'json',
					method : 'post',
					success : function(result) {
						if (result.status == 1000) {
							$j('#userDg').datagrid('reload');
							$j('#userDg').datagrid('clearSelections');
							$j.messager.show({'title' : '提示','msg':result.data});
						}
					}
				});
			}
		});
	} else {
		$j.messager.alert('提示','请选中要删除的记录!');
	}
});


$j('#saveUser').click(function(){
	$j('#userForm').form('submit',{
		url : '/system/user/addUser.htm',
		success : function(result) {
			if (result.status == 1000) {
				  $j('#addUser').dialog('close');
				  $j.messager.alert('提示',result.data);
				  $j('#userDg').datagrid('reload');
			}
			
		}
	});
});


var t = 1;
$j('#userType').combobox({
	onSelect : function(data){
		t = data.value;
	}
});

$j('#search').click(function(){
	var c = $j('#condition').val();
	$j('#userDg').datagrid({
		queryParams : {
			type : t,
			condition : c
		}
	});
});

function changeStatus(val,row){  
    if (val == 5){  
        return '可用';  
    } 
    if (val == 10) {
    	return '禁用';
    }
} 
function changeSex(val,row) {
	 if (val == 1){  
	        return '男';  
	    } 
	    if (val == 0) {
	    	return '女';
	    }
}

/*$j.ajax({
url : '/system/user/addUser.htm',
method : 'post',
success : function(result) {
	alert('提交成功');
}
});*/

