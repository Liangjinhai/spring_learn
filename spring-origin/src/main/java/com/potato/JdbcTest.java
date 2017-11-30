package com.potato;

import java.sql.*;

/**
 * Created by potato on 2017/10/17.
 */
public class JdbcTest {
    //1521为连接的端口号
    private static String url="jdbc:oracle:thin:@localhost:1521:orcl";
    //system为登陆oracle数据库的用户名
    private static String user="potato";
    //manager为用户名system的密码
    private static String password="potato1990";
    public static Connection conn;
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static Statement st ;
    //连接数据库的方法
    public void getConnection(){
        try {
            //初始化驱动包
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //根据数据库连接字符，名称，密码给conn赋值
            conn= DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    //测试能否与oracle数据库连接成功
    public static void main(String[] args) throws  Exception{
        JdbcTest  basedao=new JdbcTest();
         basedao.getConnection();

        String sql = "select count(1) from myuser ";  // 插入数据的sql语句

        st = (Statement) conn.createStatement();    // 创建用于执行静态sql语句的Statement对象

        boolean count = st.execute(sql);  // 执行插入操作的sql语句，并返回插入数据的个数

        System.out.println("执行sql " + count + " 条数据"); //输出插入操作的处理结果

        conn.close();   //关闭数据库连接


        if(conn==null){
            System.out.println("与oracle数据库连接失败！");
        }else{
            System.out.println("与oracle数据库连接成功！");
        }
    }
}
