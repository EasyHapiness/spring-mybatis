package com.study.springmybaties.factory;

import com.study.springmybaties.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @Desc 这是BeanFactory的后置处理器，在这里可以修改beanDefinition，但是不能创建一个在这里可以修改beanDefinition
 * 这个类只是为了 证明能修改beanDefinition，这个类在整个spring-mybatis项目中是没有实际作用的（本项目）
 *
 * @Author
 * @Date 2019/7/23
 */
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        GenericBeanDefinition testDao = (GenericBeanDefinition) beanFactory.getBeanDefinition("testDao");
        testDao.setBeanClass(UserService.class);

    }
}
