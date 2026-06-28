package com.husnain.XMLBasedConfig;

public class beanLIfeCycle {
    public beanLIfeCycle() {
        System.out.println("1: beanLIfeCycle instance created.");
    }
    public void init(){
        System.out.println("2: beanLIfeCycle init method.");
    }
    public void destroy(){
        System.out.println("3: beanLIfeCycle destroy method.");
    }
    public void check(){
        System.out.println("4: beanLIfeCycle check method.");
    }
}
