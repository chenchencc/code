package com.jason.mybatis;

import com.jason.domain.BlackMacinfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        String resouce = "mybatis/config.xml";
        InputStream is = Resources.getResourceAsStream(resouce);

        // 构建sqlSession工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 获取sqlSession
        SqlSession session = sqlSessionFactory.openSession();

        BlackMacinfo info ;

        try {
            /**
             * 第一种方式: 直接执行已映射的 SQL 语句
             */
            String statement = "com.jason.dao.MacDao.getAll";
            List<BlackMacinfo> macinfoList = session.selectList(statement);
        }
        finally {
            session.close();
        }

        /**
         * 第二种方式: 执行更清晰和类型安全的代码
         */
//        UserDao userDao = session.getMapper(UserDao.class);
//        user = userDao.getById(1);
//        System.out.println(user);
    }
}
