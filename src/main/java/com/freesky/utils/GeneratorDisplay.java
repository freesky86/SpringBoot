package com.freesky.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * pom.xml 中需要配置
 		<dependency>
		    <groupId>org.mybatis.generator</groupId>
		    <artifactId>mybatis-generator-core</artifactId>
		    <version>1.3.2</version>
		    <scope>compile</scope>
			<optional>true</optional>
		</dependency>
 * 注意，这里的版本号是1.3.2 .这个版本有类 org.mybatis.generator.api.dom.xml.Element，高版本的jar没有这个类，会导致执行报错
 * 
 * 这个类会读取generatorConfig.xml文件，其中配置了数据库连接和表名City。
 * 运行这个类的main函数会生成三个文件
 * 1.com.freesky.bean目录下的City.java
 * 2.com.freesky.mapper目录下的CityMapper.java
 * 3.src/main/resources/mapper目录下的CityMapper.xml
 * 
 * @author maxzhang
 *
 */
public class GeneratorDisplay {

	public void generator() throws Exception{

		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		//指定 逆向工程配置文件
		File configFile = new File("generatorConfig.xml"); 
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);

	} 
	
	public static void main(String[] args) throws Exception {
		try {
			GeneratorDisplay generatorSqlmap = new GeneratorDisplay();
			generatorSqlmap.generator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
