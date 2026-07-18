package com.example.filterDemo.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingResponseWrapper;

import java.io.IOException;

@Component
public class ResponseBodyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        ContentCachingResponseWrapper wrappedResponse =
                new ContentCachingResponseWrapper(httpServletResponse);

        filterChain.doFilter(httpServletRequest, httpServletResponse);

        byte[] orignalByteBody = wrappedResponse.getContentAsByteArray();
        String orignalString = new String(orignalByteBody);

        String modifiedBody = """
                {
                    "originalResponse" : %s,
                    "appName" : "Student Management System"
                }
                """.formatted(orignalString);
        wrappedResponse.resetBuffer();
        wrappedResponse.getWriter().write(modifiedBody);
        wrappedResponse.copyBodyToResponse();

    }
}
