package com.jianyu.redis;

import java.util.HashSet;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Redis集群测试
 * @author BaiJianyu
 *
 */
public class RedisClusterTest {
	public static void main(String[] args) {
		// 相关代码如下：

		JedisPoolConfig config = new JedisPoolConfig();
		config = new JedisPoolConfig();
		config.setMaxTotal(60000);// 设置最大连接数
		config.setMaxIdle(1000); // 设置最大空闲数
		config.setMaxWaitMillis(3000);// 设置超时时间
		config.setTestOnBorrow(true);

		// 集群结点
		Set<HostAndPort> jedisClusterNode = new HashSet<HostAndPort>();
		jedisClusterNode.add(new HostAndPort("192.168.220.128", Integer.parseInt("7000")));
		jedisClusterNode.add(new HostAndPort("192.168.220.128", Integer.parseInt("7001")));
		jedisClusterNode.add(new HostAndPort("192.168.220.128", Integer.parseInt("7002")));
		jedisClusterNode.add(new HostAndPort("192.168.220.129", Integer.parseInt("7003")));
		jedisClusterNode.add(new HostAndPort("192.168.220.129", Integer.parseInt("7004")));
		jedisClusterNode.add(new HostAndPort("192.168.220.129", Integer.parseInt("7005")));
		jedisClusterNode.add(new HostAndPort("192.168.220.130", Integer.parseInt("7006")));
		jedisClusterNode.add(new HostAndPort("192.168.220.130", Integer.parseInt("7007")));
		jedisClusterNode.add(new HostAndPort("192.168.220.130", Integer.parseInt("7008")));

		JedisCluster jc = new JedisCluster(jedisClusterNode, config);
		jc.set("name", "baijianyu666");
		String value = jc.get("name");
		System.out.println(value);
	}
}
