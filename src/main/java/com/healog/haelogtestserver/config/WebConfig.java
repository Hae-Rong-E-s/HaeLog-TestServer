package com.healog.haelogtestserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
                // 자원 공유할 경로 설정 -> 파라미터로 url 지정 (와일드카드 or , 로 여러 개 지정 가능)
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                // second 단위
                .maxAge(3000);
    }
}
