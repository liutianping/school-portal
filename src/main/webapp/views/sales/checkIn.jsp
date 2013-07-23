<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript" src="../../script/man/book.js"></script>
<body style="height:100%;">
<div class="easyui-panel" fit="true" border="false" style="height:100%;overflow:hidden">
    <div class="cart">
        <div class="ctitle">借阅车</div>
        <div style="background:#fff">
        <table id="cartcontent" fitColumns="true" style="width1:300px;height:auto;">
            <thead>
                <tr>
                    <th field="name" width=140>名称</th>
                    <th field="quantity" width=60 align="right">数量</th>
                    <th field="price" width=60 align="right">价格</th>
                </tr>
            </thead>
        </table>
        </div>
        <div class="ctitle" style="position:absolute;bottom:10px">拖动至此处添加至借阅车</div>
    </div>
    <div class="products">
        <ul>
            <li>
                <a href="#" class="item">
                    <img src="/img/book1.jpg" width="160" height="160"/>
                    <div>
                        <p>黑洞</p>
                        <p>价格:￥25</p>
                    </div>
                </a>
            </li>
            <li>
                <a href="#" class="item">
                    <img src="/img/book2.jpg" width="160" height="160"/>
                    <div>
                        <p>吃我吃我</p>
                        <p>价格:￥25</p>
                    </div>
                </a>
            </li>
            <li>
                <a href="#" class="item">
                    <img src="/img/book3.jpg" width="160" height="160"/>
                    <div>
                        <p>新执行</p>
                        <p>价格:￥25</p>
                    </div>
                </a>
            </li>
            <li>
                <a href="#" class="item">
                    <img src="/img/book4.jpg" width="160" height="160"/>
                    <div>
                        <p>惊奇物语</p>
                        <p>价格:￥25</p>
                    </div>
                </a>
            </li>
            <li>
                <a href="#" class="item">
                    <img src="/img/book5.jpg" width="160" height="160"/>
                    <div>
                        <p>java编程思想</p>
                        <p>价格:￥25</p>
                    </div>
                </a>
            </li>
            <li>
                <a href="#" class="item">
                    <img src="/img/book6.jpg" width="160" height="160"/>
                    <div>
                        <p>java从入门到精通</p>
                        <p>价格:￥25</p>
                    </div>
                </a>
            </li>
            <li>
                <a href="#" class="item">
                    <img src="/img/book7.jpg" width="160" height="160"/>
                    <div>
                        <p>疯狂java讲义</p>
                        <p>价格:￥25</p>
                    </div>
                </a>
            </li>
        </ul>
    </div>
</div>
 
    <style type="text/css">
        .products{
            overflow:auto;
            height:100%;
            background:#fafafa;
        }
        .products ul{
            list-style:none;
            margin:0;
            padding:0px;
        }
        .products li{
            display:inline;
            float:left;
            margin:10px;
        }
        .item{
            display:block;
            text-decoration:none;
        }
        .item img{
            border:1px solid #333;
        }
        .item p{
            margin:0;
            font-weight:bold;
            text-align:center;
            color:#c3c3c3;
        }
        .cart{
            float:right;
            position:relative;
            width:260px;
            height:100%;
            background:#ccc;
            padding:0px 10px;
        }
        .ctitle{
            text-align:center;
            color:#555;
            font-size:18px;
            padding:10px;
        }
    </style>
    <script>
        $j(function(){
            $j('#cartcontent').datagrid({
                singleSelect:true,
                showFooter:true
            });
            $j('.item').draggable({
                revert:true,
                proxy:'clone',
                onStartDrag:function(){
                    $j(this).draggable('options').cursor = 'not-allowed';
                    $j(this).draggable('proxy').css('z-index',10);
                },
                onStopDrag:function(){
                    $j(this).draggable('options').cursor='move';
                }
            });
            $j('.cart').droppable({
                onDragEnter:function(e,source){
                    $j(source).draggable('options').cursor='auto';
                },
                onDragLeave:function(e,source){
                    $j(source).draggable('options').cursor='not-allowed';
                },
                onDrop:function(e,source){
                    var name = $j(source).find('p:eq(0)').html();
                    var price = $j(source).find('p:eq(1)').html();
                    addProduct(name, parseFloat(price.split("￥")[1]));
                }
            });
        });
        
        function addProduct(name,price){
            var dg = $j('#cartcontent');
            var data = dg.datagrid('getData');
            function add(){
                for(var i=0; i<data.total; i++){
                    var row = data.rows[i];
                    if (row.name == name){
                        row.quantity += 1;
                        return;
                    }
                }
                data.total += 1;
                data.rows.push({
                    name:name,
                    quantity:1,
                    price:price
                });
            }
            add();
            dg.datagrid('loadData', data);
            var cost = 0;
            var rows = dg.datagrid('getRows');
            for(var i=0; i<rows.length; i++){
                cost += rows[i].price*rows[i].quantity;
            }
            dg.datagrid('reloadFooter', [{name:'Total',price:cost}]);
        }
    </script>
</body>