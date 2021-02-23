package cn.mk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>智慧公务车信息平台-注册中心启动类</b>
 * @author  MK
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class OcRegistryCenterStarter {
	public static void main(String[] args) {
		SpringApplication.run(OcRegistryCenterStarter.class,args);
	}
}
