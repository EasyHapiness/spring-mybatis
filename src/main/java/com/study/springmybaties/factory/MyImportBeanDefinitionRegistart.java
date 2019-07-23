package com.study.springmybaties.factory;

import com.study.springmybaties.dao.SongDao;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Desc
 * @Author
 * @Date 2019/7/23
 */
public class MyImportBeanDefinitionRegistart  implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {


        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(MyMapperFactoryBean.class);

        AbstractBeanDefinition beanDefinition = builder.getBeanDefinition();

        /**
         * <bean id="userMapper" class="org.mybatis.spring.mapper.MapperFactoryBean">
         *   <property name="mapperInterface" value="org.mybatis.spring.sample.mapper.UserMapper" />
         *   <property name="sqlSessionFactory" ref="sqlSessionFactory" />
         * </bean>
         */
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(SongDao.class);

        registry.registerBeanDefinition("test",beanDefinition);
    }
}
