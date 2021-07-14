# SpringBoot

This project  shows how to use Spring Boot in your project including

1. jackson-databind
    <dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
		</dependency>

  use jackson annotation for com.freesky.bean.User class
  eg. @JsonIgnoreProperties({ "password", "uid" })
  @JsonFormat(locale = "zh", pattern = "yyyy-MM-dd HH:mm:ss a")
  
  http://localhost:8080/api/users

3. MySQL connection
4. MyBatic CRUD demo
5. use tk.mybatis and pagehelper to realize pagination
6. Redis with Spring Boot
7. interceptor
8. security
9. thymeleaf demo
10. freemaker demo
