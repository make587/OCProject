package cn.mk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b>智慧公务车信息平台-用户功能模块-Provider启动类</b>
 * @author  MK
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableEurekaClient
@MapperScan("cn.mk.dao")
@SpringBootApplication
public class UserProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(UserProviderStarter.class,args);
	}
}
