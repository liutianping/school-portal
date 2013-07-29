<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <div id="addResource" style="width:300px;height:350px;" 
			class="easyui-dialog" closed="true" modal="true" buttons="#dlg-buttons" title="资源添加">
		<div style="padding:10px;">
			<div style="float:left">
				<form id="resourceForm" method="post"  style="margin:0;padding:0">
					<table>
					    <tr></tr>
						<tr>
							<td style="width:80px">资源编号</td>
							<td><input type="text" class="easyui-validatebox e-input" id="code" name="code" required="true"></input></td>
						</tr>
						<tr>
							<td>资源名称</td>
							<td><input type="text" class="e-input" id="resourceName" name="resourceName"></input></td>
						</tr>
						<tr>
							<td>资源url</td>
							<td><input type="text" class="e-input" id="resourceUrl" name="resourceUrl"></input></td>
						</tr>
						<tr>
							<td>排序</td>
							<td><input type="text" class="e-input" id="ordered" name="ordered"></input></td>
						</tr>
						<tr>
							<td>状态</td>
							<td>
								<select class="easyui-combobox" name="status" panelHeight="60" style="width:155px" id="status">
									<option value="5">可用</option>
									<option value="10">禁用</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>资源类型</td>
							<td>
								<select class="easyui-combobox" name="resoucreType" panelHeight="60" style="width:155px" id="resoucreType">
									<option value="5">菜单</option>
									<option value="10">按钮</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>父资源id</td>
							<td>
								<select  class="easyui-combobox" name="parentId" panelHeight="60" style="width:155px" id="parentId">
									<option value="5">菜单</option>
									<option value="10">按钮</option>
								</select>
							</td>
						</tr>
					</table>
				</form>
			</div>
			<div style="clear:both"></div>
		</div>
		<div id="dlg-buttons" style="text-align:center;">
			<a href="#" class="easyui-linkbutton" iconCls="icon-save" id="saveResource">确定</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$j('#addResource').dialog('close')">取消</a>
		</div>
	</div>
	 
