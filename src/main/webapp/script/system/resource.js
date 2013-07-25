$j('#addResourceBtn').click(function(){
	$j('#resourceForm').form('clear');
	$j('#addResource').dialog('open');
});

$j('#saveResource').click(function(){
	$j('#resourceForm').form('submit',{
		url : '',
		success : function(result) {
			
		}
	})
});