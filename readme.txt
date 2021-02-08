----------------------------------------------------------
1. Create a Spring Boot application.
	https://spring.io/guides/gs/spring-boot/#scratch

http://localhost:8080/
http://localhost:8080/actuator/health
http://localhost:8080/actuator/info
http://localhost:8080/actuator
http://localhost:8080/actuator/shutdown
	
2. Run it from command line
打开终端进入项目文件夹，执行如下 mvn 命令启动项目：
mvn spring-boot:run
D:\Users\freesky\git\SpringBoot>mvn spring-boot:run
或
mvnw spring-boot:run
D:\Users\freesky\git\SpringBoot>mvnw spring-boot:run

***Note: there should be only ONE main() method in java classes.
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

3. Spring MVC
	https://spring.io/guides/gs/serving-web-content/
	
4. Spring Web Security (but it doesn't work well on my local)
	https://spring.io/guides/gs/securing-web/