# TDD

## 开发环境
- JDK11+

## 业务目标
"镶金玫瑰"!这是一家魔兽世界里的小商店。出售的商品也都是高价值的。但不妙的是，随着商品 逐渐接近保质期，它们的价值也不断下滑。你需要开发一个 IT 系统来更新库存
信息。

首先，简单介绍一下我们的系统:

1. 所有商品都有一个 SellIn 值，这是商品距离过期的天数，最好在这么多天之内卖
   掉
2. 所有商品都有一个 Quality 值，代表商品的价值
3. 商品的 SellIn 值和 Quality 值，它们每天会发生变化，但是会有特例 商品的价格

规则说明如下:

1. 商品的价值永远不会小于 0，也永远不会超过 50
2. 商品每过一天价值会下滑 1 点 ，一旦过了保质期，价值就以双倍的速度下滑
3. 陈年干酪(Aged Brie)是一种特殊的商品，放得越久，价值反而越高
4. 萨弗拉斯(Sulfuras)是一种传奇商品，没有保质期的概念，价值也不会下滑
5. 后台门票(Backstage pass)和陈年干酪(Aged Brie)有相似之处:
    - 越接近演出日，商品的价值反而上升
    - 在演出前 10 天，价值每天上升 2 点
    - 演出前 5 天，价值每天上升 3 点
    - 一旦过了演出日，价值就马上变成 0
## Tasking
1. 普通商品
    - Given 普通商品，SellIn>0 且 Quality>0 When 天数+1 Then SellIn-1,Quality-1
    - Given 普通商品，SellIn>0 且 Quality=0 When 天数+1 Then SellIn-1,Quality不变
    - Given 普通商品，SellIn<1 且 Quality>0 When 天数+1 Then SellIn-1,Quality-2
    - Given 普通商品，SellIn<1 且 Quality=0 When 天数+1 Then SellIn-1,Quality不变
2. 陈年干酪(Aged Brie)
    - Given Aged Brie，Quality<50且sellIn>0 When 天数+1 Then SellIn-1,Quality+1
    - Given Aged Brie，Quality<50且sellIn<1 When 天数+1 Then SellIn-1,Quality+2
    - Given Aged Brie，Quality=50 When 天数+1 Then SellIn-1,Quality不变
3. 萨弗拉斯(Sulfuras)
    - Given Sulfuras When 天数+1 Then Quality不变
4. 后台门票(Backstage pass)
    - Given Backstage pass，SellIn>10 且 Quality<50 When 天数+1 Then SellIn-1,Quality+1
    - Given Backstage pass，SellIn>10 且 Quality=50 When 天数+1 Then SellIn-1,Quality不变
    - Given Backstage pass，5<SellIn<11 且 Quality<50 When 天数+1 Then SellIn-1,Quality+2
    - Given Backstage pass，5<SellIn<11 且 Quality=50 When 天数+1 Then SellIn-1,Quality不变
    - Given Backstage pass，0<SellIn<6 且 Quality<50 When 天数+1 Then SellIn-1,Quality+3
    - Given Backstage pass，0<SellIn<6 且 Quality=50 When 天数+1 Then SellIn-1,Quality不变
    - Given Backstage pass，SellIn=0 When 天数+1 Then SellIn-1,Quality=0

## 编码路线


## 参考资料
- [JUnit 5用户指南](https://gitee.com/liushide/junit5_cn_doc/blob/master/junit5UserGuide_zh_cn.md#https://gitee.com/link?target=https%3A%2F%2Fgithub.com%2Fjunit-team%2Fjunit5-samples%2Ftree%2Fr5.0.2%2Fjunit5-gradle-consumer)
- [Gradle 用户指南](https://docs.gradle.org/current/userguide/userguide.html)