package com.imooc.ioc.test;

import oracle.jdbc.driver.OracleDriver;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.*;

/**
 * 连接Oracle工具类
 *
 * @author xiaolei hu
 * @date 2018/6/2 11:44
 **/
public class JdbcUtil {
    // 表示定义数据库的用户名
    private static String USERNAME;

    // 定义数据库的密码
    private static String PASSWORD;

    // 定义访问数据库的地址
    private static String URL;

    // 数据库连接
    private Connection connection;

    // 数据库的执行对象
    private PreparedStatement preparedStatement;

    // 数据库返回的结果集
    private ResultSet resultSet;

    // properties对象，保存了数据库配置信息
    private static Properties properties;

    // 初始化配置文件
    public JdbcUtil() {
        System.out.println("开始加载数据库配置文件");
        InputStream inputStream = JdbcUtil.class
                .getResourceAsStream("jdbc.properties");
        properties = new Properties();
        try {
            properties.load(inputStream);
            USERNAME = properties.getProperty("jdbc.username");
            PASSWORD = properties.getProperty("jdbc.password");
            URL = properties.getProperty("jdbc.url");
            properties.put("user", USERNAME);
            properties.put("password", PASSWORD);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("数据库配置文件加载成功");
    }

    public Connection getConnection() {
        try {
            //Class.forName("oracle.jdbc.OracleDriver");
            Driver driver = new OracleDriver();
            DriverManager.deregisterDriver(driver);
            connection = DriverManager.getConnection(URL, properties);
            System.out.println("获取数据库连接成功，connection：" + connection);
            //preparedStatement = connection.prepareStatement("select * from user_info");
//            preparedStatement = connection.prepareStatement("insert into user_info(user_name, age) values(?, ?)");
//            preparedStatement.setString(1, "测试用户");
//            preparedStatement.setString(2, "22");
//            int row = preparedStatement.executeUpdate();
//            System.out.println("成功插入了：" + row + "行");
//            while (resultSet.next()) {
//                int id = resultSet.getInt(1);
//                String user_name = resultSet.getString(2);
//                String age = resultSet.getString(3);
//                System.out.println(id + ", " + user_name + ", " + age);
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 执行更新（包括了删除，增加）操作
     *
     * @param sql    sql语句
     * @param params 执行参数
     * @return 执行结果
     * @throws SQLException
     */
    public boolean updateByPreparedStatement(String sql, List<?> params)
            throws SQLException {
        boolean flag = false;
        int result = -1;// 表示当用户执行添加删除和修改的时候所影响数据库的行数
        preparedStatement = connection.prepareStatement(sql);
        int index = 1;
        // 填充sql语句中的占位符
        if (params != null && !params.isEmpty()) {
            for (int i = 0; i < params.size(); i++) {
                preparedStatement.setObject(index++, params.get(i));
            }
        }
        result = preparedStatement.executeUpdate();
        flag = result > 0 ? true : false;
        return flag;
    }

    /**
     * 执行查询操作
     *
     * @param sql    sql语句
     * @param params 执行参数
     * @return
     * @throws SQLException
     */
    public List<Map<String, Object>> findResult(String sql, List<?> params)
            throws SQLException {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        int index = 1;
        preparedStatement = connection.prepareStatement(sql);
        if (params != null && !params.isEmpty()) {
            for (int i = 0; i < params.size(); i++) {
                preparedStatement.setObject(index++, params.get(i));
            }
        }
        resultSet = preparedStatement.executeQuery();
        ResultSetMetaData metaData = resultSet.getMetaData();
        // 获取查询出来的数据的列数
        int cols_len = metaData.getColumnCount();
        while (resultSet.next()) {
            Map<String, Object> map = new HashMap<String, Object>();
            for (int i = 0; i < cols_len; i++) {
                // 获取列名（字段名）
                String cols_name = metaData.getColumnName(i + 1);
                // 获取该列的值
                Object cols_value = resultSet.getObject(cols_name);
                if (cols_value == null) {
                    cols_value = "";
                }
                map.put(cols_name, cols_value);
            }
            list.add(map);
        }
        return list;
    }

    /**
     * 释放资源
     */
    public void releaseConn() {
        System.out.println("开始释放数据库资源");
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("数据库资源释放成功");
    }

    public static void main(String[] args) {
        JdbcUtil jdbcUtil = new JdbcUtil();
        jdbcUtil.getConnection();
        try {
            // 增加数据
            List<Object> paramsInsert = new ArrayList<Object>();
            paramsInsert.add("测试");
            paramsInsert.add(23);
            boolean resultInsert = jdbcUtil.updateByPreparedStatement("insert into user_info(user_name, age) values(?, ?)", paramsInsert);
            System.out.println(resultInsert);

            // 删除数据
            List<Object> paramsDelete = new ArrayList<Object>();
            paramsDelete.add(20);
            boolean resultDelete = jdbcUtil.updateByPreparedStatement("delete from user_info where id = ?", paramsDelete);
            System.out.println(resultDelete);

            // 更新数据
            List<Object> paramsUpdate = new ArrayList<Object>();
            paramsUpdate.add(26);
            paramsUpdate.add(3);
            boolean result = jdbcUtil.updateByPreparedStatement("update user_info set age = ? where id = ?", paramsUpdate);
            System.out.println(result);

            // 查询数据
            List<Object> paramsFind = new ArrayList<Object>();
            paramsFind.add(6);
            List<Map<String, Object>> resultFind = jdbcUtil.findResult(
                    "select * from user_info where id = ?", paramsFind);
            for (Map<String, Object> m : resultFind) {
                System.out.println(m);
            }
            //System.out.println(result.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtil.releaseConn();
        }
    }
}
