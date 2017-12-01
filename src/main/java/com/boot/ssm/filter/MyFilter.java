package com.boot.ssm.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 采用Servlet3.0的注解进行配置
 * 除了@WebFilter，还有@WebServlet 、@WebListener
 */
@WebFilter(filterName="myFilter",urlPatterns="*.html")
public class MyFilter implements Filter{
    private static Logger log = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("*****************init Filter****************");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("*****************doFilter****************");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        log.info("*****************Filter destory****************");
    }
}
