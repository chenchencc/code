package com.jason.javassist;

import javassist.*;

public class JavassistDemo {

    public static void main(String[] args) throws NotFoundException, CannotCompileException, InstantiationException, IllegalAccessException{
        CtClass ctClass= ClassPool.getDefault().get("com.jason.javassist.Demo");
        String oldName="forJavassistTest";
        CtMethod ctMethod=ctClass.getDeclaredMethod(oldName);
        String newName=oldName+"$impl";
        ctMethod.setName(newName);
        CtMethod newMethod=CtNewMethod.copy(ctMethod,"forJavassistTest",ctClass, null);
        StringBuffer sb=new StringBuffer();
        sb.append("{System.out.println(\"22222222\");\n")
                .append(newName+"($$);\n")
                .append("System.out.println(\"11111111111\");\n}");
        newMethod.setBody(sb.toString());
        //增加新方法
        ctClass.addMethod(newMethod);
        //类已经更改，注意不能使用A a=new A();，因为在同一个classloader中，不允许装载同一个类两次
        Demo a=(Demo)ctClass.toClass().newInstance();
        a.forJavassistTest();
    }
}
class Demo{

    public void forJavassistTest() {
        System.out.println("---------------1-------------");
    }
}
