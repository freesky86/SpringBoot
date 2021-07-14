# SpringBoot

This project  shows how to use Spring Boot in your project including

## jackson-databind
	<dependency>
		<groupId>com.fasterxml.jackson.core</groupId>
		<artifactId>jackson-databind</artifactId>
	</dependency>

  use jackson annotation for com.freesky.bean.User class
 	 eg. @JsonIgnoreProperties({ "password", "uid" })
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
## MySQL connection
## MyBatic CRUD demo
## use tk.mybatis and pagehelper to realize pagination
## Redis with Spring Boot
## interceptor
## security
