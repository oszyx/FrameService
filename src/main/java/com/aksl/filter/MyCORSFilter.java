package com.aksl.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class MyCORSFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setHeader("Access-Control-Allow-Origin", "*");//所有域名都有权限访问
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");//访问方式
        response.setHeader("Access-Control-Max-Age", "3600");//时间 
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization,content-type");
        response.setHeader("Access-Control-Allow-Credentials","true");
        filterChain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
