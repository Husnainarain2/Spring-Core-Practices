package com.husnain.FirstWeek;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

@Configurable
@ComponentScan
public class AppConfig {
    @Bean
    @Scope("prototype")
    public Manager manager() {
        return new Manager();
    }

    @Bean(initMethod = "init", destroyMethod =
            "stop")
    public callbackMethod initMethod() {
        return new callbackMethod();
    }
}
//    @Bean(initMethod = "init")
//    public callbackMethod initMethod(){
//        return new callbackMethod();
//    }
//}

