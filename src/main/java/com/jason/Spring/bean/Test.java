package com.jason.Spring.bean;

import com.google.common.collect.Lists;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {
//        Resource resource = new ClassPathResource("spring/spring-context.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//        BeanTest test = (BeanTest) factory.getBean("bean");
//        System.out.println(test.print("Jason"));

        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        //context.getBean(SpringBeanLifeCycle.class);
    }

    @org.junit.Test
    public void print(){
        int m = 1000;
//        for (int i=671;i<741;i++){
//            String sql = "update bm_rider_recruit set allocate_time = ctime where valid = 1 and allocation_type in(1,2,4) and id > "+i*m+" and id <"+m*(i+1)+";";
//            System.out.println(sql);
//        }

        A a = new A();
        a.setList(Lists.newArrayList(1,2,3,4,5));

        a.getList().add(6);

        a.getList().stream().forEach(System.out::print);

    }


    class A{
        private List<Integer> list;

        public List<Integer> getList() {
            return list;
        }

        public void setList(List<Integer> list) {
            this.list = list;
        }
    }
}
