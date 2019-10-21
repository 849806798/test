package com.example.test.Demo;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.io.*;
import java.util.List;

public class Util {
    StringBuffer s = new StringBuffer();
    public  void  SqlUtil(DataDTO dataDTO){
        s.append ("INSERT INTO sys_resource(`id`,`resource_code`,`resource_name`,`resource_url`,`parentId`,`resource_icon`,`resource_type`,`resource_status`" +
                ",`create_time`,`update_time`)VALUE");
        s.append("(");
        s = StringUtils.isEmpty(dataDTO.getId()) ? s.append("'',") : s.append("'10"+dataDTO.getId()+"'").append(",");
        s = StringUtils.isEmpty(dataDTO.getResourceCode()) ? s.append("'',") : s.append("'"+dataDTO.getResourceCode()+"'").append(",");
        s = StringUtils.isEmpty(dataDTO.getResourceName()) ? s.append("'',") : s.append("'"+dataDTO.getResourceName()+"'").append(",");
        s = StringUtils.isEmpty(dataDTO.getUrl()) ? s.append("'',") : s.append("'"+dataDTO.getUrl()+"'").append(",");
        s = StringUtils.isEmpty(dataDTO.getParentId()) ? s.append("'',") : s.append("'10"+dataDTO.getParentId()+"'").append(",");
        s = StringUtils.isEmpty(dataDTO.getIcon()) ? s.append("'',") : s.append("'"+dataDTO.getIcon()+"'").append(",");
        s = StringUtils.isEmpty(dataDTO.getType()) ? s.append("'1',") : s.append("'"+dataDTO.getType()+"'").append(",");
        s.append("'-1',now(),now());\r\n");
        //System.out.println(s);
    }


      public void JointSql(List<DataDTO> list){
          for (DataDTO dataDTO : list) {

              SqlUtil(dataDTO);
              if (!CollectionUtils.isEmpty(dataDTO.getChildren())) {
                       JointSql(dataDTO.getChildren());
              }
              //System.out.println(dataDTO);

          }
      }

    public  void WriteStringToFile(String filePath,StringBuffer sb) throws IOException {
            try {
             File file = new File(filePath); //地址
             PrintStream ps = new PrintStream(new FileOutputStream(file));
             FileOutputStream fos = new FileOutputStream(file);
             OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");





             ps.println(new String(sb.toString().getBytes(),"utf-8"));
                try {
                          osw.write(sb.toString());
                          osw.flush();
                          osw.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                 } catch (FileNotFoundException e) {
                          e.printStackTrace();
                 }
                 }



    }









