package project;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
// @EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        .allowedOrigins("https://make-my-routine.run.goorm.io")
        // .allowedMethods("GET", "POST", "PUT", "DELETE")
        .maxAge(3000) //maxAge메소드를 이용해서 원하는 시간만큼 pre-flight 리퀘스트를 캐싱 해둘 수 있습니다.
        ;
    }
    
}