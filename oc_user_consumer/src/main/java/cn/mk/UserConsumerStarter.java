package cn.mk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b>智慧公务车信息平台-用户功能模块-Consumer启动类</b>
 * @author  MK
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableEurekaClient
@SpringBootApplication
public class UserConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(UserConsumerStarter.class,args);
	}
}
