package com.shoukeplus.jFinal.filter.gzip;

import com.shoukeplus.jFinal.filter.HttpFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GZIPFilter extends HttpFilter {
  private Logger logger = LoggerFactory.getLogger(getClass());

  public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {

    String ae = request.getHeader("accept-encoding");
    //check if browser support gzip
    if (ae != null && ae.indexOf("gzip") != -1) {
      logger.debug("GZIP supported, compressing.");
      GZIPResponseWrapper wrappedResponse = new GZIPResponseWrapper(response);
      chain.doFilter(request, wrappedResponse);
      wrappedResponse.finishResponse();
      return;
    }
    chain.doFilter(request, response);

  }

  public void init(FilterConfig filterConfig) {
    // noop
  }

  public void destroy() {
    // noop
  }
}