package com.jason.design;

/**
 * 模板模式
 */
public class TemplateDesign {
    public static void main(String[] args) {
        People p = new People();
        p.hello("Jason");
        Annimal annimal = new Annimal();
        annimal.hello("Jason");
    }
}

class People extends Say{

    @Override
    String say(String word) {
        return "您好啊！"+word;
    }
}

class Annimal extends Say{

    @Override
    String say(String word) {
        return "wang..wang.."+word;
    }
}



abstract class Say{

    abstract String say(String word);

    public void hello(String word){
        System.out.println(say(word));
    }

}

