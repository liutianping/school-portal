<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript" src="../../script/system/resource.js"></script>
    <table class="easyui-datagrid" title="" style="width:700px;height:250px"
            data-options="rownumbers:true,singleSelect:true,url:'${pageContext.request.contextPath}/system/resource/queryResourceList.htm',toolbar:'#resTb'"
            fit="true" pagination="true" id="resourceDg">
        <thead>
            <tr>
                <th data-options="field:'resourceId',width:80" sortable="true">资源id</th>
                <th data-options="field:'code',width:100" sortable="true">资源编号</th>
                <th data-options="field:'resourceName',width:80,align:'right'" sortable="true">资源名称</th>
                <th data-options="field:'resourceUrl',width:80,align:'right'" sortable="true">资源url</th>
                <th data-options="field:'ordered',width:240,align:'center'" sortable="true">顺序</th>
                <th data-options="field:'status',width:240,align:'center'" sortable="true">状态</th>
                <th data-options="field:'resoucreType',width:240,align:'center'" sortable="true">资源类型</th>
                <th data-options="field:'createTime',width:240,align:'center'" sortable="true">创建时间</th>
                <th data-options="field:'updateTime',width:240,align:'center'" sortable="true">更新时间</th>
                <th data-options="field:'parentId',width:240,align:'center'" sortable="true">父资源id</th>
            </tr>
        </thead>
    </table>
    <div id="resTb" style="padding:5px;height:auto">
        <div style="margin-bottom:5px">
             <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" id="addResourceBtn">添加</a>
             <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" id="editResourceBtn">修改</a>
             <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" id="removeResourceBtn">删除</a>
        </div>
        
        <table>
           <tr>
              <td><select class="easyui-combobox" panelHeight="auto" style="width:200px" name="type" id="userType">
                <option value="all">查询全部</option>
                <option value="code">资源编号</option>
                <option value="resourceName">资源名称</option>
                <option value="resourceUrl">资源url</option>
                <option value="ordered">顺序</option>
                <option value="status">状态</option>
                <option value="resoucreType">资源类型</option>
                <option value="parentId">父资源id</option>
              </select></td>
              <td><input class="easyui-box" type="text" name="condition" id="condition" width="200"/><a href="#" class="easyui-linkbutton" iconCls="icon-search" id="search">查找</a></td>
           </tr>
           <tr>
              <td>创建起始时间: <input class="easyui-datebox" style="width:120px"></td>
              <td>创建结束时间: <input class="easyui-datebox" style="width:150px"></td>
           </tr>
        </table>
    </div>
    
      <%@ include file="addResource.jsp" %>
