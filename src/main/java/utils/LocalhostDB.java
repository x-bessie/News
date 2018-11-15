package utils;

import Mapper.LocalhostMapper;
import dao.LoalhostDao;
import entity.All;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class LocalhostDB {
    private static SqlSessionFactory sessionFactory;

    static {
        try {
            String resource = "mybatis/mybatis-cfg-wb_xy.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sessionFactory.getConfiguration().addMapper(LocalhostMapper.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession() {
        return sessionFactory.openSession();
    }

    public static void main(String[] args) {
//    WxYssXyDB.getSession();

    }
}











