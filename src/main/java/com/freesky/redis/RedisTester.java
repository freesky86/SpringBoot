package com.freesky.redis;

import redis.clients.jedis.Jedis;

/**
 * 首先启动Redis服务，并设置key1
 * 可参考 https://www.runoob.com/redis/redis-install.html
 * 
 * Redis本地路径 D:\Software\Redis-x64-5.0.9
 * 启动Redis服务
 * 1. 打开cmd窗口，进入上面的路径
 * 2. 执行命令 redis-server.exe redis.windows.conf
 * 
 * 设置key1的值
 * 1. 打开cmd窗口，进入上面的路径
 * 2. 执行命令 redis-cli.exe -h 127.0.0.1 -p 6379
 * 3. 设置键值对: set key1 value1
 * 4. 取出键值对: get key1
 * 运行main函数也可取出键值对
 * 参考文献 https://www.runoob.com/redis/redis-java.html
 * 
 * @author freesky
 *
 */
public class RedisTester {

	public static void main(String[] args) {
	      //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost", 6379);
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+ jedis.ping());
        jedis.set("key2", "Max");
        System.out.println("key1: " + jedis.get("key1"));
        System.out.println("key2: " + jedis.get("key2"));

	}

}
