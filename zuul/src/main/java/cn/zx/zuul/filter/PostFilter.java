package cn.zx.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.io.IOUtils;
import org.springframework.cloud.netflix.ribbon.RibbonHttpResponse;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 23:27 2019/7/16 0016
 */
@Component
public class PostFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        try {
            Object zuulResponse = RequestContext.getCurrentContext().get("zuulResponse");
            if (zuulResponse != null) {
                RibbonHttpResponse resp = (RibbonHttpResponse) zuulResponse;
                String body = IOUtils.toString(resp.getBody());
                HttpHeaders headers = resp.getHeaders();
                System.err.println(body);
                resp.close();
                RequestContext.getCurrentContext().setResponseBody(body);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
