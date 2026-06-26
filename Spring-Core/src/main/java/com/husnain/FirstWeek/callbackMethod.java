package com.husnain.FirstWeek;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
//@Component
public class callbackMethod
//        implements InitializingBean
        {

    private Map<Integer,String> map;
    public callbackMethod(){
        System.out.println("callbackMwthod constructor");
        this.map = new HashMap<Integer, String>();
    }
    /*************First way********/

//    @PostConstruct
//    public void putValueInMap(){
//        System.out.println("putValueInMap method called");
//        this.map.put(1,"One");
//        this.map.put(2,"Two");
//        this.map.put(3,"Three");
//        this.map.put(4,"Four");
//        this.map.put(5,"Five");
//    }

    /************* Second way********/
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("afterPropertiesSet method called");
//        this.map.put(1,"One");
//        this.map.put(2,"Two");
//        this.map.put(3,"Three");
//        this.map.put(4,"Four");
//        this.map.put(5,"Five");
//    }
    public String getValueInMap(int key){
        return this.map.get(key);
    }
            /*************Third way********/
            public void init(){
                System.out.println("initMethod called");
                this.map.put(1,"One");
                this.map.put(2,"Two");
                this.map.put(3,"Three");
                this.map.put(4,"Four");
                this.map.put(5,"Five");
            }

            public void stop(){
                System.out.println("stopMethod called");
                this.map.clear();
            }
}

// Three Common Ways to Write Initialization Logi
// first is @PostConstructor way
//Seconnd is InitializingBean Interface implement
// third is created in configuration class and
// use @Bean annotation with initMethod
// attribute and use
// ConfigurableApplicationContext instead of
// ApplicationContext in Main


// Same rule for destory the bean in singleton
// but their name is different

