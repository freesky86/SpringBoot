# SpringBoot

This project  shows how to use Spring Boot in your project including

## jackson-databind
	<dependency>
		<groupId>com.fasterxml.jackson.core</groupId>
		<artifactId>jackson-databind</artifactId>
	</dependency>

  use jackson annotation for com.freesky.bean.User class
 	@JsonIgnoreProperties({ "password", "uid" })
  	@JsonFormat(locale = "zh", pattern = "yyyy-MM-dd HH:mm:ss a")
  
 	 http://localhost:8080/api/users

## freemaker demo
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-freemarker</artifactId>
		</dependency>

application.properties

	############################################################
	#
	# freemarker 静态资源配置
	#
	############################################################
	#设定ftl文件路径
	spring.freemarker.template-loader-path=classpath:/templates
	# 关闭缓存，即时刷新，上线生成环境需要设置成true
	spring.freemarker.cache=false
	spring.freemarker.charset=UTF-8
	spring.freemarker.check-template-location=true
	spring.freemarker.content-type=text/html
	spring.freemarker.expose-request-attributes=true
	spring.freemarker.expose-session-attributes=true
	spring.freemarker.request-context-attribute=request
	spring.freemarker.suffix=.ftl

FreemarkerController.java

	http://localhost:8080/ftl/index
	http://localhost:8080/ftl/center

## thymeleaf demo
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>

application.properties
	############################################################
	#
	# thymeleaf 静态资源配置
	#
	############################################################
	spring.thymeleaf.prefix=classpath:/templates/
	spring.thymeleaf.suffix=.html
	spring.thymeleaf.mode=HTML5
	spring.thymeleaf.encoding=UTF-8
	spring.thymeleaf.content-type=text/html
	# 关闭缓存，即时刷新，上线生成环境需要设置成true
	spring.thymeleaf.cache=false

ThymeleafController.java

	http://localhost:8080/th/index
	http://localhost:8080/th/center

## Global Exception handling
IMoocExceptionHandler.java
	@ControllerAdvice
	@ExceptionHandler(value = Exception.class)

ErrorController.java

	http://localhost:8080/err/error
	http://localhost:8080/err/ajaxerror
	
/templates/error.html

## MySQL connection
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
		</dependency>

application.properties
	############################################################
	#
	# 配置数据源相关，使用阿里巴巴druid数据源
	#
	############################################################
	spring.datasource.url=jdbc:mysql://localhost:3306/world?useUnicode=true&characterEncoding=UTF-8&serverTimezone=EST
	spring.datasource.username=root
	spring.datasource.password=dev1234567890
	#spring.datasource.driver-class-name=com.mysql.jdbc.Driver
	spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
	spring.datasource.druid.initial-size=1
	spring.datasource.druid.min-idle=1
	spring.datasource.druid.max-active=20
	spring.datasource.druid.test-on-borrow=true
	spring.datasource.druid.stat-view-servlet.allow=true

## MyBatic CRUD demo
MyBatisCRUDController.java
	
	http://localhost:8080/mybatis/queryCityList
	http://localhost:8080/mybatis/queryCityById?cityId=1962

## use tk.mybatis and pagehelper to realize pagination
CityController.java
	
	http://localhost:8080/city/pagination

## Custom Mapper for Mybatis
application.properties

	# mybatis 配置
	mybatis.type-aliases-package=com.freesky.bean
	mybatis.mapper-locations=classpath:mapper/*.xml

/mapper/CityMapperCustom.xml

CityMapperCustom.java
	
	the interface name should be same as the name of CityMapperCustom.xml.
	the method name defined here should be same as the "id" attribute value of <selelct> element in CityMapperCustom.xml.

## Redis with Spring Boot
RedisController.java

How to use Redis, refer to RedisTester.java

## interceptor
## security
