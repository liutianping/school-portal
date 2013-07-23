<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript" src="../../script/system/user.js"></script>
    <table class="easyui-datagrid" title="" style="width:700px;height:250px"
            data-options="rownumbers:true,singleSelect:true,url:'${pageContext.request.contextPath}/system/user/queryUserList.htm',toolbar:'#tb'"
            fit="true" pagination="true" id="userDg">
        <thead>
            <tr>
                <th data-options="field:'userId',width:80" sortable="true">用户id</th>
                <th data-options="field:'userName',width:100" sortable="true">用户名</th>
                <th data-options="field:'nickName',width:80,align:'right'" sortable="true">昵称</th>
                <th data-options="field:'phoneNum',width:80,align:'right'" sortable="true">电话</th>
                <th data-options="field:'email',width:150" sortable="true">邮箱</th>
                <th data-options="field:'sex',width:60,align:'center'" formatter="changeSex" sortable="true">性别</th>
                <th data-options="field:'status',width:60,align:'center'" formatter="changeStatus" sortable="true">状态</th>
                <th data-options="field:'birthday',width:240,align:'center'" sortable="true">生日</th>
                <th data-options="field:'createTime',width:240,align:'center'" sortable="true">创建时间</th>
                <th data-options="field:'updateTime',width:240,align:'center'" sortable="true">更新时间</th>
            </tr>
        </thead>
    </table>
    <div id="tb" style="padding:5px;height:auto">
        <div style="margin-bottom:5px">
            <a href="#" class="easyui-linkbutton easyui-tooltip" title="添加" iconCls="icon-add" id="addUserBtn" plain="true"></a>
            <a href="#" class="easyui-linkbutton easyui-tooltip" title="更新" iconCls="icon-edit" id="editUserBtn" plain="true"></a>
            <a href="#" class="easyui-linkbutton easyui-tooltip" title="删除" iconCls="icon-cut" id="removeUserBtn" plain="true"></a>
        </div>
        
        <table>
           <tr>
              <td><select class="easyui-combobox" panelHeight="auto" style="width:200px" name="type" id="userType">
                <option value="1">查询全部</option>
                <option value="2">用户名</option>
                <option value="3">昵称</option>
                <option value="4">电话</option>
                <option value="5">邮箱</option>
                <option value="6">性别</option>
                <option value="7">状态</option>
              </select></td>
              <td><input class="easyui-box" type="text" name="condition" id="condition" width="200"/><a href="#" class="easyui-linkbutton" iconCls="icon-search" id="search">查找</a></td>
           </tr>
           <tr>
              <td>创建起始时间: <input class="easyui-datebox" style="width:120px"></td>
              <td>创建结束时间: <input class="easyui-datebox" style="width:150px"></td>
           </tr>
        </table>
    </div>
    
    <%@ include file="addUser.jsp" %>
