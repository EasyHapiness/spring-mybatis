package com.study.springmybaties.proxy;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Desc
 * @Author
 * @Date 2019/7/23
 */
public class TestInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String string = method.getAnnotation(Select.class).value()[0];

        System.out.println("===================" + string);
        return null;
    }
}
