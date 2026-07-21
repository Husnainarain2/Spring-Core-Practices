package com.example.filterDemo.config;

import com.example.filterDemo.handlerInterceptor.AuthenticationInterceptor;
import com.example.filterDemo.handlerInterceptor.LoggingInterceptor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configurable
public class WebConfig implements WebMvcConfigurer {

    private final LoggingInterceptor loggingInterceptor;
    private final AuthenticationInterceptor  authenticationInterceptor;
    public WebConfig(LoggingInterceptor loggingInterceptor,
                     AuthenticationInterceptor authenticationInterceptor) {
        this.loggingInterceptor = loggingInterceptor;
        this.authenticationInterceptor= authenticationInterceptor;
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loggingInterceptor);
        registry.addInterceptor(authenticationInterceptor).order(1);
    }
}
