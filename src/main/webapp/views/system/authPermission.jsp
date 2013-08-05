<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <div style="margin:10px 0;"></div>
    <div class="easyui-panel" title="" style="width:700px;height:250px;padding:10px;"
       data-options="fit:true,border:true">
        <div class="easyui-layout" data-options="fit:true">
        <!-- north -->
            <div data-options="region:'north',split:true"  split="true" style="height:100px;padding:10px;" data-options="collapsed:true">
                <div style="padding:10px 0 10px 60px" align="center">
                  <table>
                    <tr>
                    <td>用户列表:</td>
                    <td>
                        <select class="easyui-combobox" style="width:150px" name="language"><option value="ar">李四</option><option value="bg">张三</option><option value="bg1">王五</option></select>
                    </td>
                    <td></td>
                    <td>
                        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">确定</a>
                    </td>
                     </tr>
                     <tr>
                        <td>角色列表:</td>
                    <td>
                        <select class="easyui-combobox" style="width:150px" name="language"><option value="ar1">超级管理员</option><option value="bg2">管理员</option><option value="bg3">普通员工</option></select>
                    </td>
                    <td></td>
                     </tr>
                   </table>
                 </div>
            </div>
             <!-- west -->
            <div data-options="region:'west',split:true" style="width:150px;height:250px">
               <table class="easyui-datagrid" title="" style="width:150px;height:250px"
            data-options="singleSelect:true,collapsible:true,
                url:'../datagrid/datagrid_data1.json',
                remoteSort:false,
                multiSort:true,fit:true">
           <thead>
              <tr>
                <th data-options="field:'ck',checkbox:true"></th>
                <th data-options="field:'roleName',width:150">角色名</th>
              </tr>
           </thead>
    </table>
            </div>
            <!-- center -->
            <div data-options="region:'center'" style="padding:10px">
                <ul class="easyui-tree">
        <li>
            <span>资源</span>
            <ul>
                <li data-options="state:'closed'">
                    <span>菜单</span>
                    <ul>
                        <li>
                            <span>Friend</span>
                        </li>
                        <li>
                            <span>Wife</span>
                        </li>
                        <li>
                            <span>Company</span>
                        </li>
                    </ul>
                </li>
                <li>
                    <span>按钮</span>
                    <ul>
                        <li>Intel</li>
                        <li>Java</li>
                        <li>Microsoft Office</li>
                        <li>Games</li>
                    </ul>
                </li>
            </ul>
        </li>
    </ul>
            </div>
            <!-- east -->
             <div data-options="region:'east'" style="width:300px;padding:10px">
                 <ul class="easyui-tree">
        <li>
            <span>权限列表</span>
            <ul>
                <li data-options="state:'closed'">
                    <span>菜单</span>
                    <ul>
                        <li>
                            <span>Friend</span>
                        </li>
                        <li>
                            <span>Wife</span>
                        </li>
                        <li>
                            <span>Company</span>
                        </li>
                    </ul>
                </li>
                <li>
                    <span>按钮</span>
                    <ul>
                        <li>Intel</li>
                        <li>Java</li>
                        <li>Microsoft Office</li>
                        <li>Games</li>
                    </ul>
                </li>
            </ul>
        </li>
    </ul>
            </div>
        </div>
    </div>