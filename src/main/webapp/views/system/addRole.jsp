<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <div id="addUser" style="width:600px;height:400px;"
			class="easyui-dialog" closed="true" modal="true" buttons="#dlg-buttons" title="用户添加">
		<div style="padding:10px;">
			<div style="float:left">
				<form id="userForm" method="post"  style="margin:0;padding:0">
					<table>
						<tr>
							<td style="width:80px">用户昵称</td>
							<td><input type="text" class="easyui-validatebox e-input" id="nickName" name="nickName" required="true"></input></td>
						</tr>
						<tr>
							<td>性别</td>
							<td>
								<select class="easyui-combobox" name="sex" panelHeight="60" style="width:60px" id="sex" name="sex">
									<option value="1">男</option>
									<option value="0">女</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>手机号码</td>
							<td><input type="text" class="e-input" id="phoneNum" name="phoneNum"></input></td>
						</tr>
						<tr>
							<td>邮箱</td>
							<td><input type="text" class="e-input" id="email" name="email"></input></td>
						</tr>
						<tr>
							<td>状态</td>
							<td>
								<select class="easyui-combobox" name="status" panelHeight="60" style="width:60px" id="status">
									<option value="5">可用</option>
									<option value="10">禁用</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>生日</td>
							<td><input type="text" class="easyui-datebox e-input" id="birthday" name="birthday"></input></td>
						</tr>
						<tr>
							<td>登录帐号</td>
							<td><input type="text" class="easyui-validatebox e-input"  required="true" id="userName" name="userName"></input></td>
						</tr>
						<tr>
							<td>登录密码</td>
							<td><input type="password" class="easyui-validatebox e-input" id="password" name="password" required="true"></input></td>
						</tr>
						<tr>
							<td>确认密码</td>
							<td><input type="password" class="easyui-validatebox e-input" id="confirmPassword" name="confirmPassword" required="true" validType="confirm['#password']"></input></td>
						</tr>
					</table>
				</form>
			</div>
			<div style="float:right">
				<table id="dt-roles" class="easyui-datagrid" style="width:200px;height:200px;"
						url="/system/user/getRoles.htm'/>"
						idField="id" fitColumns="true">
					<thead>
						<tr>
							<th field="ck1" checkbox="true"></th>
							<th field="name1" width="80">普通用户</th>
						</tr>
						<tr>
							<th field="ck2" checkbox="true"></th>
							<th field="name2" width="80">管理员</th>
						</tr>
						<tr>
							<th field="ck3" checkbox="true"></th>
							<th field="name3" width="80">超级管理员</th>
						</tr>
					</thead>
				</table>
			</div>
			<div style="clear:both"></div>
		</div>
		<div id="dlg-buttons" style="text-align:center;">
			<a href="#" class="easyui-linkbutton" iconCls="icon-save" id="saveUser">确定</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$j('#addUser').dialog('close')">取消</a>
		</div>
	</div>
