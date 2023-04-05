# SpringMVCDemo
听说 SpringMVC 很有趣，学起来很giao


## 理路
古德曰：**理路要清楚，理则顿悟，事需渐除**  
缘起：SpringMVC解决了什么？ 答曰：解决了 JavaWeb中的常见需求，如表单收集， 参数接收，文件上传等
- 替换了servlet, why?
1. 荒原般的servlet，用过都知道
2. 原始的参数获取过程
3. 原始的路径跳转
4. ajax交互需要转换流
---
总分总的叙事结构
---

**controller创建步骤**
1. 添加依赖 :spring-webmvc
2. web.xml 配置 前端controller: id="/cup"
3. 添加springmvc配置文件
4. coding for Controller :implements Controller
5. 浏览器访问Controller: tomcat 访问


- 解析器
- 控制器
- 映射器
- 适配器


### springmvc的view 不就是 django template
| springmvc | name       | django       | name   |  
|-----------|------------|--------------|--------|
| view      | .jsp       | template     | .html  |
| jstl      | 模板语法       | jinja2       | 模板语法   |
| model     | new User() | model        | User() |


### modelAndView


