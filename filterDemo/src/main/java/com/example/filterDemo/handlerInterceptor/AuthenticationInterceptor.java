package com.example.filterDemo.handlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AuthenticationInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            String apiKey =request.getHeader("x-api" +
                    "-key");
            if(apiKey != null && !apiKey.equals("secret123")) {
                return false;
            }
            return true;
    }
}
