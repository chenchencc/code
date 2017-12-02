package com.jason.spi;

import java.util.ServiceLoader;
import java.util.spi.LocaleServiceProvider;

public class Test {

    @org.junit.Test
    public void test(){
        ServiceLoader<Say> says = ServiceLoader.load(Say.class);
        Say say = says.iterator().next();
say.say("hahah");
        //says.forEach(r-> r.say("asas"));
        //LocaleServiceProvider
    }
}
