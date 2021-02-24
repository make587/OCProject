package cn.mk.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("redisDemo")
@RequestMapping("/redis")
public class RedisDemo {
	@Autowired
	private StringRedisTemplate redisTemplate;

	@RequestMapping("/save/{name}")
	public boolean save(@PathVariable("name") String name)throws Exception{
		// 使用 StringRedisTemplate 操作 Redis
		redisTemplate.opsForValue().set("name",name);
		return true;
	}
	@RequestMapping("/get/{key}")
	public boolean get(@PathVariable("key") String name)throws Exception{
		// 使用 StringRedisTemplate 操作 Redis
		redisTemplate.opsForValue().get(name);
		return true;
	}
}
