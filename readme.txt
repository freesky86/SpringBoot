----------------------------------------------------------
1. Create a Spring Boot application.
	https://spring.io/guides/gs/spring-boot/#scratch
	
	Spring Initializr
	https://start.spring.io/

http://localhost:8080/
http://localhost:8080/actuator/health
http://localhost:8080/actuator/info
http://localhost:8080/actuator
http://localhost:8080/actuator/shutdown
	
2. Run it from command line
打开终端进入项目文件夹，执行如下 mvn 命令启动项目：
mvn spring-boot:run
>> D:\Users\freesky\git\SpringBoot>mvn spring-boot:run
或
mvnw spring-boot:run
>> D:\Users\freesky\git\SpringBoot>mvnw spring-boot:run

***Note: there should be only ONE main() method in java classes.
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
Spring Boot在Unix环境下运行
https://www.hangge.com/blog/cache/detail_2454.html
首先,执行命令 mvn package
>> mvn package
<注意mvn package打包的时候，需要unit test都跑通才可以打包，否则会报错。当然，可以通过指令skip test。>
这样会在target目录下生产jar包，比如这个SpringBoot项目会生成 springboot-0.0.1-SNAPSHOT.jar
通过 java -jar 命令可以直接启动这个 jar 文件
>> java -jar springboot-0.0.1-SNAPSHOT.jar
我们还可以在命令后面加个 &，表示后台运行
>> java -jar springboot-0.0.1-SNAPSHOT.jar &
由于在生产环境中，Linux 大多数情况下都是远程服务器，然后使用远程工具连接 Linux。如果使用上面命令启动 JAR，一旦窗口关闭，JAR 也就停止运行了，因此一般通过如下命令启动 JAR：
>> nohup java -jar springboot-0.0.1-SNAPSHOT.jar &
<注意：nohup 表示当窗口关闭时服务不挂起，继续在后台运行。>


3. Spring MVC
	https://spring.io/guides/gs/serving-web-content/
	
4. Spring Web Security (but it doesn't work well on my local)
	https://spring.io/guides/gs/securing-web/
	
微服务教程
http://c.biancheng.net/view/4626.html

