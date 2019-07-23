package com.study.springmybaties.main;

import com.study.springmybaties.config.AppConfig;
import com.study.springmybaties.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Desc
 * @Author
 * @Date 2019/7/23
 */
public class TestMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService songDao = annotationConfigApplicationContext.getBean(UserService.class);


        System.out.println(songDao.getObejct());

       /* Class[] clazz = new Class[]{SongDao.class};
        SongDao userDao = (SongDao) Proxy.newProxyInstance(TestMain.class.getClassLoader(),clazz,new TestInvocationHandler());*/
       /* SongDao userDao = annotationConfigApplicationContext.getBean(SongDao.class);
        System.out.println(userDao.query());*/
//        System.out.println(annotationConfigApplicationContext.getBean(SongDao.class));





    }


}
