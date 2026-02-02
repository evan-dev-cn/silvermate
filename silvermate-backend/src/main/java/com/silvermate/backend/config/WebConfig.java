package com.silvermate.backend.config;
/**
 * ClassName: ApiResponse
 * Package: com.silvermate.backend.config
 * Description:跨域配置
 *
 * @Author Evander
 * @Create 2026/1/31 14:45
 * @Version 1.0
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")           // 允许所有来源
                .allowedMethods("*")           // 允许所有请求方式 (GET, POST等)
                .allowedHeaders("*")           // 允许所有请求头
                .allowCredentials(false)       // 关键：关闭凭证支持，避开安全冲突
                .maxAge(3600);
    }
}
