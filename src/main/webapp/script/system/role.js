/*var editIndex = undefined;
function endEditing() {
	if (editIndex == undefined) {
		return true
	}
	if ($j('#roleroleDg').datagrid('validateRow', editIndex)) {
		var ed = $j('#roleDg').datagrid('getEditor', {
			index : editIndex,
			field : 'roleId'
		});
    //	var productname = $j(ed.target).combobox('getText');
	//	$j('#roleDg').datagrid('getRows')[editIndex]['productname'] = productname;
		$j('#roleDg').datagrid('endEdit', editIndex);
		editIndex = undefined;
		return true;
	} else {
		return false;
	}
}

$j('#roleDg').datagrid({
	onClickRow : function(index) {
		if (editIndex != index) {
			if (endEditing()) {
				$j('#roleDg').datagrid('selectRow', index).datagrid('beginEdit', index);
				editIndex = index;
			} else {
				$j('#roleDg').datagrid('selectRow', editIndex);
			}
		}
	}
});

function append() {
	if (endEditing()) {
		$j('#roleDg').datagrid('appendRow', {
			status : 'P'
		});
		editIndex = $j('#roleDg').datagrid('getRows').length - 1;
		$j('#roleDg').datagrid('selectRow', editIndex).datagrid('beginEdit',
				editIndex);
	}
}
function removeit() {
	if (editIndex == undefined) {
		return
	}
	$j('#roleDg').datagrid('cancelEdit', editIndex).datagrid('deleteRow', editIndex);
	editIndex = undefined;
}
function accept() {
	if (endEditing()) {
		$j('#roleDg').datagrid('acceptChanges');
	}
}
function reject() {
	$j('#roleDg').datagrid('rejectChanges');
	editIndex = undefined;
}
function getChanges() {
	var rows = $j('#roleDg').datagrid('getChanges');
	alert(rows.length + ' rows are changed!');
}*/
//########################################################################### 华丽分割线 ###############################################################

