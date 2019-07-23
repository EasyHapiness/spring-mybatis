package com.study.springmybaties.factory;

import com.study.springmybaties.proxy.TestInvocationHandler;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * @Desc
 * @Author
 * @Date 2019/7/23
 */

public class MyMapperFactoryBean implements FactoryBean {

    Class mapperInterface;
    public MyMapperFactoryBean(Class mapperInterface){
        this.mapperInterface = mapperInterface;
    }

    @Override
    public Object getObject() throws Exception {

        Class[] clazz = new Class[]{mapperInterface};
        Object object =
                Proxy.newProxyInstance(this.getClass().getClassLoader(),clazz,new TestInvocationHandler());
        return object;
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public void setaClass(Class mapperInterface) {
        this.mapperInterface = mapperInterface;
    }
}
