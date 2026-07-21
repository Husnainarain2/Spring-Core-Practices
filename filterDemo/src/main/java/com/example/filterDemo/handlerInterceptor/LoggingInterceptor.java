package com.example.filterDemo.handlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class LoggingInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        System.out.println("Incoming request..." +
                "....");
        System.out.println("Http Method "+ request.getMethod());
        System.out.println("Http URI "+ request.getRequestURI());
        System.out.println("Http Host "+ request.getRemoteHost());
        System.out.println("Client Ip "+ request.getRemoteAddr());
        System.out.println("Token Header"+ request.getHeader("token"));
        
        if(handler instanceof HandlerMethod handlerMethod){
            System.out.println("Method Name "+ handlerMethod.getMethod().getName());
            System.out.println("Controller"+ handlerMethod.getBean().getClass().getName());
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("Logging Interceptor" +
                " postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.println("Logging Interceptor" +
                " afterCompletion");
        System.out.println("Status Code "+ response.getStatus());
    }
}
