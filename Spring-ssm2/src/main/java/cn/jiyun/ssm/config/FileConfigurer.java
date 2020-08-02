package cn.jiyun.ssm.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
public class FileConfigurer {
    @Value("${file.upload.path}")
    private String filePath;
    @Value("${file.upload.relative.path}")
    private String relativePath;



    public  void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler(relativePath).addResourceLocations("file:/"+filePath);
    }

}
