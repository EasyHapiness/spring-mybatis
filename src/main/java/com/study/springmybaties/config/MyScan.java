package com.study.springmybaties.config;

/**
 * @Desc
 * @Author
 * @Date 2019/7/23
 */

import com.study.springmybaties.factory.MyImportBeanDefinitionRegistart;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportBeanDefinitionRegistart.class)
public @interface  MyScan {
}
