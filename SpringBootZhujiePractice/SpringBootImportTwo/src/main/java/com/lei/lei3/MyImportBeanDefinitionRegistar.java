package com.lei.lei3;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        /*手动注册一个名为teacher的Bean到IOC容器中*/
        RootBeanDefinition rootBeanDefinition=new RootBeanDefinition(Teacher.class);
        beanDefinitionRegistry.registerBeanDefinition("teacher",rootBeanDefinition);
    }
}
