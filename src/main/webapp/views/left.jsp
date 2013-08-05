<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript">
var setting = {
		data: {
			simpleData: {
				enable: true
			}
		}
	};

	var zNodes =[
		{ id:1, pId:0, name:"系统管理", open:true, iconOpen:"../../js/ztree/css/zTreeStyle/img/diy/1_open.png", iconClose:"../../js/ztree/css/zTreeStyle/img/diy/1_close.png"},
		{ id:11, pId:1, name:"用户管理", icon:"../../js/ztree/css/zTreeStyle/img/diy/2.png", target : '/system/user/queryUserList.htm'},
		{ id:12, pId:1, name:"角色管理", icon:"../../js/ztree/css/zTreeStyle/img/diy/3.png", target : '/system/role/queryRoleList.htm'},
		{ id:13, pId:1, name:"资源管理", icon:"../../js/ztree/css/zTreeStyle/img/diy/5.png", target : '/system/resource/queryResourceList.htm'},
		{ id:14, pId:1, name:"权限分配", icon:"../../js/ztree/css/zTreeStyle/img/diy/5.png", target : '/system/permission/authPermission.htm'},
		{ id:15, pId:1, name:"值班表", icon:"../../js/ztree/css/zTreeStyle/img/diy/5.png"},
		{ id:16, pId:1, name:"主题切换", icon:"../../js/ztree/css/zTreeStyle/img/diy/5.png",target : '/system/user/changeTheme.htm'},
		{ id:2, pId:0, name:"展开、折叠 自定义图标相同", open:true, icon:"../js/ztree/css/zTreeStyle/img/diy/4.png"},
		{ id:21, pId:2, name:"叶子节点1", icon:"../../js/ztree/css/zTreeStyle/img/diy/6.png"},
		{ id:22, pId:2, name:"叶子节点2", icon:"../../js/ztree/css/zTreeStyle/img/diy/7.png"},
		{ id:23, pId:2, name:"叶子节点3", icon:"../../js/ztree/css/zTreeStyle/img/diy/8.png"},
		{ id:3, pId:0, name:"图书管理", open:true, icon:"../js/ztree/css/zTreeStyle/img/diy/4.png"},
		{ id:31, pId:3, name:"图书标签管理", icon:"../../js/ztree/css/zTreeStyle/img/diy/6.png"},
		{ id:32, pId:3, name:"图书类型管理", icon:"../../js/ztree/css/zTreeStyle/img/diy/7.png"},
		{ id:32, pId:3, name:"图书评论管理", icon:"../../js/ztree/css/zTreeStyle/img/diy/7.png"},
		{ id:33, pId:3, name:"借阅登记", icon:"../../js/ztree/css/zTreeStyle/img/diy/8.png", target : '/book/sales/checkIn.htm'},
		{ id:4, pId:0, name:"报表管理", open:true, icon:"../js/ztree/css/zTreeStyle/img/diy/4.png"},
		{ id:41, pId:4, name:"图书统计报表", icon:"../../js/ztree/css/zTreeStyle/img/diy/6.png"},
		{ id:42, pId:4, name:"图书借阅报表", icon:"../../js/ztree/css/zTreeStyle/img/diy/6.png"},
		{ id:5, pId:0, name:"互动中心", open:true, icon:"../js/ztree/css/zTreeStyle/img/diy/4.png"},
		{ id:51, pId:5, name:"聊天室", icon:"../../js/ztree/css/zTreeStyle/img/diy/6.png"}
	]

	$j(document).ready(function(){
		$j.fn.zTree.init($j("#treeDemo"), setting, zNodes);
		
		$j("#treeDemo a").click(function(){
		       var value = $j(this).text();
		       var href = $j(this).attr("target");
		       //如果tab存在   不允许再次打开
		       if ($j("#tabs").tabs('exists',value)) {
		    	   $j.messager.alert('提示','不能重复打开操作界面!','question');
		       } else {
		    	   $j('#tabs').tabs('add',{
			            title: value,
			            closable: true,
			            href : href
			       });
		       }
		});
		
		
	});
</script>
		<div region="west" split="true" title=" " style="width:280px;padding1:1px;overflow:hidden;">
			<div class="easyui-accordion" fit="true" border="false">
				<div title="菜单栏" style="overflow:auto;" class="men">
					<ul id="treeDemo" class="ztree"></ul>
				</div>
			</div>
		</div>