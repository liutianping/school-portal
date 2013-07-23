<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript" src="../../script/system/user.js"></script>
    <table class="easyui-datagrid" title="" style="width:700px;height:250px"
            data-options="rownumbers:true,singleSelect:true,url:'${pageContext.request.contextPath}/system/user/queryUserList.htm',toolbar:'#tb'"
            fit="true" pagination="true" id="userDg">
        <thead>
            <tr>
                <th data-options="field:'userId',width:80">用户id</th>
                <th data-options="field:'userName',width:100">用户名</th>
                <th data-options="field:'nickName',width:80,align:'right'">昵称</th>
                <th data-options="field:'phoneNum',width:80,align:'right'">电话</th>
                <th data-options="field:'email',width:150">邮箱</th>
                <th data-options="field:'sex',width:60,align:'center'">性别</th>
                <th data-options="field:'status',width:60,align:'center'">状态</th>
                <th data-options="field:'birthday',width:240,align:'center'">生日</th>
                <th data-options="field:'createTime',width:240,align:'center'">创建时间</th>
                <th data-options="field:'updateTime',width:240,align:'center'">更新时间</th>
            </tr>
        </thead>
    </table>
    <div id="tb" style="padding:5px;height:auto">
        <div style="margin-bottom:5px">
            <a href="#" class="easyui-linkbutton easyui-tooltip" title="添加" iconCls="icon-add" id="addUserBtn" plain="true"></a>
            <a href="#" class="easyui-linkbutton easyui-tooltip" title="更新" iconCls="icon-edit" id="editUserBtn" plain="true"></a>
            <a href="#" class="easyui-linkbutton easyui-tooltip" title="删除" iconCls="icon-cut" id="removeUserBtn" plain="true"></a>
        </div>
        <div>
                               起始时间: <input class="easyui-datebox" style="width:150px">
                               结束时间: <input class="easyui-datebox" style="width:150px">
                               状态: 
            <select class="easyui-combobox" panelHeight="auto" style="width:100px">
                <option value="5">可用</option>
                <option value="10">禁用</option>
            </select>
            <a href="#" class="easyui-linkbutton" iconCls="icon-search">查找</a>
        </div>
    </div>
    
    <%@ include file="addUser.jsp" %>
