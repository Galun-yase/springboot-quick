package com.chengzi.component;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;
//定制自己的错误 数据信息
@Component
public class MyErrorAttributes extends DefaultErrorAttributes {

    //返回值map就是页面或者json可以获取到的所有数据
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
        Map<String, Object> map = super.getErrorAttributes(webRequest, options);
        map.put("exception","UserNotExistException");
        //从异常处理器中取出的数据，并返回
        Object ext1 = webRequest.getAttribute("ext", 0);
        map.put("ext",ext1);

        return map;
    }
}
