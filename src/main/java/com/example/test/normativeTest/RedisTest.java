package com.example.test.normativeTest;


import redis.clients.jedis.Jedis;

import java.util.List;

public class RedisTest {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        jedis.auth("123456");
        System.out.println("连接成功");
        //设置 redis 字符串数据
        /*jedis.set("runoobkey", "www.runoob.com");
        jedis.lpush("site-list", "Runoob");
        jedis.lpush("site-list", "Google");
        jedis.lpush("site-list", "Taobao");*/
        // 获取存储的数据并输出
        List<String> list = jedis.lrange("site-list", 0 ,1);
        for(int i=0; i<list.size(); i++) {
            System.out.println("列表项为: "+list.get(i));
        }
        System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkey"));
        System.out.println("服务正在运行: "+jedis.ping());
    }
}
