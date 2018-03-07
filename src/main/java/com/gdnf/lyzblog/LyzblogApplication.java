package com.gdnf.lyzblog;

import com.gdnf.lyzblog.cores.config.TestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
@ComponentScan("com.gdnf.lyzblog")
@EnableConfigurationProperties(TestConfig.class)
public class LyzblogApplication {


//	extends SpringBootServletInitializer
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(DemoApplication .class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(LyzblogApplication.class, args);
	}
}
