package com.chengzi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//扩展SpringMvc 不改变SpringBoot自动配置的东西
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //super.addViewControllers(registry);

        //浏览器发送/chengzi请求来到404页面（也是模板引擎解析）
        registry.addViewController("/chengzi").setViewName("404");
    }
}
