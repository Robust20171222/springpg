package com.xrc.spring.awaretask;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String BeanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String beanName) {
        this.BeanName = beanName;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void OutPutResult(){

        System.out.println(BeanName);

        Resource resource = loader.getResource("/awaretask/aware.txt");

        try {

            System.out.println(IOUtils.toString(resource.getInputStream()));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
