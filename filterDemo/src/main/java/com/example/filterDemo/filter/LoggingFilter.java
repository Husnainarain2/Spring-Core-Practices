package com.example.filterDemo.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

import java.util.UUID;

//@Component
public class LoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        long startTime = System.currentTimeMillis();

        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;

        String requestId= UUID.randomUUID().toString();
        httpResponse.setHeader("X-Request-ID", requestId);

        System.out.println("Incoming request: "
                +httpRequest.getMethod()+" "+
                httpRequest.getRequestURI());

        try {
            filterChain.doFilter(servletRequest, servletResponse);
        }
       finally {
            long endTime = System.currentTimeMillis();
        System.out.println("Outgoing response: " + httpResponse.getStatus());
            System.out.println("Time taken: "+ (endTime - startTime));

        }

    }
}
//        System.out.println("Request enter in LoggingFilter");
//        filterChain.doFilter(servletRequest, servletResponse);
//        System.out.println("Request exit in LoggingFilter");
