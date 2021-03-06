package yzm.txl.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.slf4j.Logger;

/**
 * rest请求过滤器
 *
 * 创建日期 2017年8月2日
 * 
 * @author txl
 * @since $version$
 */
@WebFilter(urlPatterns = "/yzm/*", filterName = "yzmFilter")
public class RequestFilter implements Filter {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(RequestFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		logger.debug("Filter started.");
	}

	@Override
	public void destroy() {
		logger.debug("Filter stoped.");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		logger.info("do filger...");
		chain.doFilter(request, response);
	}

}
