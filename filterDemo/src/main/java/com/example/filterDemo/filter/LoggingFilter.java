package com.example.filterDemo.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class LoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;

        System.out.println("Incoming request: " +httpRequest.getMethod()+" "+httpRequest.getRequestURI());
        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("Outgoing response: " + httpResponse.getStatus());
    }
}
//        System.out.println("Request enter in LoggingFilter");
//        filterChain.doFilter(servletRequest, servletResponse);
//        System.out.println("Request exit in LoggingFilter");
