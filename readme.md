# 超级实体类

## 项目描述
很多时候我们需要去封装很不规则的数据，传统的实体类不能随意添加修改属性，超级实体类就此产生

## 使用方法
- maven依赖
```java
    
```
- 在任何需要实体封装的地方set

```java
    SuperPojo superPojo = new SuperPojo();
    superPojo.setPropertity("key", 123);
    System.out.println(superPojo.get("key"));
```