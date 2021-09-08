package com.luoyu.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/9/8 4:46 下午
 * @description
 */

public class MyTypeFilter implements TypeFilter {

    /**
     * metadataReader:读取的当前正在扫描的类的信息
     * metadataReaderFactory：可以获取其他类的信息
     * @params [metadataReader, metadataReaderFactory]
     * @return boolean
     * @author luoyu
     * @date 2021/9/8 4:48 下午
     **/
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        //获取当前类注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取当前正在扫描的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        //获取当前类资源（类路径等）
        Resource resource = metadataReader.getResource();
        String className = classMetadata.getClassName();
        System.out.println("-----:"+className);
        if (className.contains("er")){
            return true;
        }
        return false;
    }
}
