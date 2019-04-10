/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  用户接口实现类
 * @author admin
 */
public class UserDaoImpl implements UserDao{
    //定义文件
    private static File file=new File("user.txt");
    //类加载的时候就把文件创建
    static{
        try {
            file.createNewFile();
                    } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public boolean login(String username, String password) {
        boolean flag =false;
        BufferedReader br=null;
        try {
            br=new BufferedReader(new FileReader("user.txt"));
            String line =null;
            while((line=br.readLine())!=null){ //读取每一行
                String []  datas =line.split("=");
                if(datas[0].equals(username)&&datas[1].equals(password)){
                    flag=true;
                    break;
                }
            }    
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            try {
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }     
        return flag;
    }

    //用户注册
    @Override
    public void regist(User user) {
        BufferedWriter bw =null;
        try {
            bw=new BufferedWriter(new FileWriter("user.txt"));
            bw.write(user.getUsername()+"="+user.getPassword());
            bw.newLine();
            bw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            try {
                bw.close();
            } catch (IOException ex) {
               ex.printStackTrace();
            }
        }
           
    }
    
}
