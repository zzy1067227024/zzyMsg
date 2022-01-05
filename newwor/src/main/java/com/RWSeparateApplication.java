package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
@SpringBootApplication
@EnableSwagger2
public class RWSeparateApplication {

	public static void main(String[] args) {
		SpringApplication.run(RWSeparateApplication.class, args);
	}

	private CorsConfiguration buildConfig() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.addAllowedOrigin("*"); // 允许任何域名使用
		corsConfiguration.addAllowedHeader("*"); // 允许任何头
		corsConfiguration.addAllowedMethod("*"); // 允许任何方法（post、get等）
		corsConfiguration.setAllowCredentials(true);
		return corsConfiguration;
	}

	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", buildConfig()); // 对接口配置跨域设置
		return new CorsFilter(source);
	}
//	@Configuration
//	public class CorsConfig {
//		private CorsConfiguration buildConfig() {
//			CorsConfiguration corsConfiguration = new CorsConfiguration();
//			corsConfiguration.addAllowedOrigin("*"); // 1允许任何域名使用
//			corsConfiguration.addAllowedHeader("*"); // 2允许任何头
//			corsConfiguration.addAllowedMethod("*"); // 3允许任何方法（post、get等）
//			return corsConfiguration;
//		}
//
//		@Bean
//		public CorsFilter corsFilter() {
//			UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//			source.registerCorsConfiguration("/**", buildConfig()); // 4
//			return new CorsFilter(source);
//		}
	}
