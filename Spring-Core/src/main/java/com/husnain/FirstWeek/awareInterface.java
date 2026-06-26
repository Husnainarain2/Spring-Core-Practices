package com.husnain.FirstWeek;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("myBean")
public class awareInterface implements BeanNameAware, ApplicationContextAware {
    public awareInterface() {
        System.out.println("awareInterface constructor");
    }
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is: " + name);
    }

    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws org.springframework.beans.BeansException {
        System.out.println("ApplicationContext is set: " + applicationContext.getClass().getName());
    }
}
