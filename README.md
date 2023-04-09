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
>#### 总分总的叙事结构

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

---
>### springmvc的view 不就是 django template
| springmvc | name       | django       | name   |  
|-----------|------------|--------------|--------|
| view      | .jsp       | template     | .html  |
| jstl      | 模板语法       | jinja2       | 模板语法   |
| model     | new User() | model        | User() |


>### modelAndView

---

>### ViewResolver
**物理视图是啥** 
- xml配置的是`InternalResourceViewResolver`
- 逻辑视图是返回的字符串 `return "myView"`
- 加上`prefix` `suffix` 就变成物理视图 ;) `说白了 字符串拼接成文件名`

**自定义解析器，了解原理**
- model设置数据
- return 返回视图名称 
- BeanNameResolver转发到view视图
- 视图用servlet转发数据和jsp页面


---

>### RequestMapping
+ 类的`@RequestMapping`表示加一层路径 
+ WEB-INF可以阻止直接访问

**一些个小点心技巧**
- `@RequestMapping(method=RequestMethod.POST) `
- `@RequestMapping(params={"验证=本人"})`
```java
@RequestMapping("path/{变量1}/{变量2}")
public String landing (@PathVariable("变量1") String a,@PathVariable("变量2") String b){
    return "view";
        }
```
---

>### Parameters

- Controller中的参数名称和 `<input name=""`保持一致
- 自动转换数据类型
- 自动封装POJO
- 自动转换Array
- 自动转为List

---

>### DateConversion

- 自定义转换类继承Converter接口
- 配置自定义服务到springmvc-config.xml `conversion-service="conversionService"`


---

>### data Validation 
**@chatGpt:第三方校验规则**
- add `hibernate-validator-6.1.2` in pom && 配置`springmvc-servlet.xml`
```pom
        <dependency>
            <groupId>org.hibernate.validator</groupId>
            <artifactId>hibernate-validator</artifactId>
            <version>6.1.2.Final</version>
        </dependency>
```
```xml
    <mvc:annotation-driven validator="validator"/>
    <bean id="validator" class="org.springframework.validation.beanvalidation.LocalValidatorFactoryBean">
        <property name="providerClass" value="org.hibernate.validator.HibernateValidator"/>
    </bean>
```

**@chatGpt**`JSR-303` 有哪些注解
1. @NotNull：验证对象是否为 null；
2. @NotEmpty：验证字符串是否非空（不为 null，且长度 > 0）；
3. @NotBlank：验证字符串是否非空且不仅包含空格字符；
4. @Min：验证数字是否大于等于指定的最小值；
5. @Max：验证数字是否小于等于指定的最大值；
6. @Size：验证字符串、集合或数组的大小是否在指定的范围内；
7. @Pattern：验证字符串是否匹配指定的正则表达式模式；
8. @Past：验证日期是否在当前时间之前；
9. @Future：验证日期是否在当前时间之后；
10. @AssertTrue：验证布尔表达式是否为 true；
11. @AssertFalse：验证布尔表达式是否为 false；
12. @Email：验证字符串是否为有效的电子邮件地址。

---
#### bug fix
- jstl显示源码：请在头文件加上`isELIgnored="false"`

> ### JsonAjaxInteract
- 依赖包 
```
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.11.3</version>
</dependency>

```
**前后端交互必须要json**
- `@ResponseBody` 直接返回对象，无需再转换
- ajax遍历的方式 `$.each(msg,function(key,value){console.log(value.id)})`
- jquery method is `$(..).click` not onclick
- `JSON.stringify({"":"","":""})`转换为json
- `contentType:"application/json"`前端声明发送json, `@RequestRequest` 后端接收json



>### Restful
实现 restful风格的要点：
- `@RestController` 替代 `@Controller`
-  `@GetMapping(value = "{id}")` 方法上方指定id `@PathVariable("id")` 方法中指定对应的参数名称
- `@RequestMapping("cups")` 放在类上，方法上无需再指定路径


>### StaticResources
- tomcat默认的servlet处理静态资源，但自己配置的web.xml中的前端控制器servlet可能会影响
- springmvc指定默认servlet处理静态资源
- springmvc自定义处理静态资源的位置mapping ` <mvc:resources`

>### Interceptor
拦截的请求会被处理，例外的请求则直接进入页面不会被处理，请求不会被拦截，也不会有任何处理。
- 配置`<mvc:interceptors`
- ` public boolean preHandle(){return true;}`返回true代表放行所有，false则中止被拦截的请求，但例外的依然不受影响


>### file upload
**@chatGpt** `springmvc处理文件上传`
- 文件上传的页面是长这样的
```html

<form id="upload" action="upload" enctype="multipart/form-data" method="post" >
  <input type="file" name="file">
  <input type="submit" name="upload">
</form>
```
>### Exception
- 依赖的jar包叫 `commons-io`
- 增加一个bean,启用multipart支持,注意要加id `<bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver"/>`
- `@RequestParam("file")`来接收上传的文件,注意这个`file`要和标签的`name`属性保持一致
- 设置属性`<property name="defaultEncoding"`

**topic:如何上传到指定目录并防止同名覆盖**
- 使用uuid,或时间戳替换文件名

>### SSM Integration

1. 添加依赖
   - mybatis
   - spring-webmvc
   - spring-web
   - spring-jdbc
   - spring-orm
   - spring-mybatis
   - mysql
   - druid
   - jackson-databind
   - log4j
   - servlet-api
   
2. 配置web.xml
   1. springmvc frontend Controller
   2. restful Filter
   3. unicode Filter
   4. Spring Listener
   5. springmvc location
3. 配置 springmvc
   ```xml
    <!--    扫包-->
    <context:component-scan base-package="com.coh.controller"/>
    <mvc:annotation-driven/>
    <mvc:default-servlet-handler/>
    <!--  解析器  -->
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/"/>
        <property name="suffix" value=".jsp"/>
    </bean>
   ```
4. 配置 spring
   ```xml
    <!--    扫描-->
    <contenxt:component-scan base-package="com.coh">
    <!--        排除@Controller,以防扫两遍-->
        <contenxt:exclude-filter type="annotation" expression="org.springframework.stereotype.Controller"/>
    </contenxt:component-scan>

    <!--    生成数据库连接池-->
    <bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource">
        <property name="driverClassName" value="com.mysql.cj.jdbc.Driver"/>
        <property name="url" value="jdbc:mysql://localhost:3306/db0?characterEncoding=utf-8&amp;serverTimezone=GMT"/>
        <property name="username" value="root"/>
        <property name="password" value="123456"/>
    </bean>
    <!--生成sqlSessionFactory-->
    <bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
        <property name="dataSource" ref="dataSource"/>
        <property name="typeAliasesPackage" value="com.coh.pojo"/>
    </bean>
    <!--扫描dao下所有的daoMapper.xml,生成实例-->
    <bean id="mapperScanner" class="org.mybatis.spring.mapper.MapperScannerConfigurer">
        <property name="sqlSessionFactory" ref="sqlSessionFactory"/>
        <property name="basePackage" value="com.coh.dao"/>
    </bean>
    <!--事务管理器-->
    <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <property name="dataSource" ref="dataSource"/>
    </bean>
    <!--    声明式事务管理 -->
    <tx:annotation-driven transaction-manager="transactionManager"/>
   ```
5. 生成mybatis
  - `你懂的`
6. coding for service and controller


**bug fix**  
- `redirect:/login.jsp`此处要加`/`和`.jsp`否则找不到正确位置