# api#

## 扫码进入主页面##

~~~
GET /foodbever/wechat/authorize
~~~

参数

~~~
无
~~~

返回

~~~
{
  "code":0
  "msg": "成功"
  "store":"福海烧烤店"
  "tables": 8
  "userName":"ajunge"
  "status" : 0 // 0 表示未下单 1 表示加单
}
~~~

## 查询商品列表##

~~~
GET /foodbever/buyer/product/list
~~~

参数

~~~
无
~~~

返回

~~~
{
  "code":0
  "msg":"成功"
  "data":[{
			"name": "热榜",
            "type": 1,
            "foods": [
                {
                    "id": "123456",
                    "name": "皮蛋粥",
                    "price": 1.2,
                    "description": "好吃的皮蛋粥",
                    "icon": "http://xxx.com",
                    "stockstatus":0,
                }
            ]
        },
        {
            "name": "好吃的",
            "type": 2,
            "foods": [
                {
                    "id": "123457",
                    "name": "慕斯蛋糕",
                    "price": 10.9,
                    "description": "美味爽口",
                    "icon": "http://xxx.com",
                    "stockstatus":0, //表示立即下单，如果是1就是加单
                }
            ]
        }  		
	}

	]
}
~~~

## 下单##

~~~
GET /foodbever/buyer/order/create
~~~

参数

~~~
"tables":3
"userOpenid":"sssssssss"
"data":[{
  "productId":"111111111"
  "productQuantity":2 //购买数量
}]
~~~

返回

~~~
"code":0
"msg":"成功"
"orderId":"11111111"
~~~

## 查看订单详情

~~~
GET /foodbever/buyer/order/detail
~~~

参数

~~~
"orderId":"1111111"
"userOpenId":"ssssssss"
~~~

返回

~~~
"code":0
"msg":"成功"
"orderId"："11111111"\
"storeName":"福海烧烤店"
"tableId":2
"userName":"sssss"
"createTime":"2000-19-9"
"data":[{
  "productName":"白酒"
  "productPrice":11
  "productQuantity":12
}]
~~~

## 派送完成请求订单完成

~~~
GET /foodbever/seller/order/sendSuccess
~~~

参数

~~~
"orderId":"aqqqqqqq"
~~~

返回

~~~
"code":0
"msg":"成功"
~~~

