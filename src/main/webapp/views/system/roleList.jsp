<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript" src="../../script/system/role.js"></script>
    <table class="easyui-datagrid" title="" style="width:700px;height:250px"
            data-options="rownumbers:true,singleSelect:true,url:'${pageContext.request.contextPath}/system/role/queryRoleList.htm',toolbar:'#roleTb'"
            fit="true" pagination="true" id="roleDg">
        <thead>
            <tr>
                <th data-options="field:'roleId',width:80" sortable="true">角色Id</th>
                <th data-options="field:'code',width:100" sortable="true">角色编号</th>
                <th data-options="field:'roleName',width:80,align:'right'" sortable="true">角色名称</th>
                <th data-options="field:'status',width:80,align:'right'" sortable="true">状态</th>
                <th data-options="field:'createTime',width:240,align:'center'" sortable="true">创建时间</th>
                <th data-options="field:'updateTime',width:240,align:'center'" sortable="true">更新时间</th>
            </tr>
        </thead>
    </table>
    <div id="roleTb" style="padding:5px;height:auto">
        <div style="margin-bottom:5px">
             <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" id="addRoleBtn">添加</a>
             <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" id="editRoleBtn">修改</a>
             <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" id="removeRoleBtn">删除</a>
        </div>
        
        <table>
           <tr>
              <td><select class="easyui-combobox" panelHeight="auto" style="width:200px" name="type" id="userType">
                <option value="1">查询全部</option>
                <option value="2">角色编号</option>
                <option value="3">角色名称</option>
                <option value="4">状态</option>
              </select></td>
              <td><input class="easyui-box" type="text" name="condition" id="condition" width="200"/><a href="#" class="easyui-linkbutton" iconCls="icon-search" id="search">查找</a></td>
           </tr>
           <tr>
              <td>创建起始时间: <input class="easyui-datebox" style="width:120px"></td>
              <td>创建结束时间: <input class="easyui-datebox" style="width:150px"></td>
           </tr>
        </table>
    </div>
    
    <%@ include file="addRole.jsp" %>
