package com.lei.lei2;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


/*
* ImportSelector实现类
* ImportSelector是一个接口，该接口中只有一个selectImports方法，用于返回某个类的全限定名，所以可以利用该特性给容器动态导入N个Bean
* */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.lei.lei2.Child"};
    }
}
