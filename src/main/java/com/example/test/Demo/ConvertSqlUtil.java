package com.example.test.Demo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConvertSqlUtil {
    public static void main(String[] args) {
       // ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
         //获取IoC容器中JdbcTemplate实例
      //  JdbcTemplate jdbcTemplate=(JdbcTemplate) ctx.getBean("jdbcTemplate");
        List<DataDTO> list=new ArrayList<DataDTO>();

        Util util=new Util();

        String pathname = "C:\\Users\\94730\\Desktop\\嘉柏乐\\nu.js"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
        String path = "C:\\Users\\94730\\Desktop\\嘉柏乐\\nu1.txt";
        File file = new File(pathname);
        Long len = file.length();
        byte[] content = new byte[len.intValue()];
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            inputStream.read(content);
        }catch (Exception e){

        }finally {
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        }
        try {
            String json = new String(content,"UTF-8");
            //String sql="INSERT INTO sys_resource(`id`,`resource_code`,`resource_name`,`resource_url`,`parentId`,`resource_icon`) VALUE ";
            Gson gson = new Gson();
            list=gson.fromJson(json, TypeToken.getParameterized(List.class, DataDTO.class).getType());
            int a=list.size();
            util.JointSql(list);
            util.WriteStringToFile(path,util.s);
            System.out.println(list);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


