package com.isoftstone.guodian.utils;

import java.util.List;
/**
 * StringBuffer:
 * StringBuilder:
 * 可变长度字符串，用于动态拼接字符串使用；
 *
 */
public class NotNullUtils {

    public static boolean strIsNotNull(String  str){
        if(str!=null&&!str.trim().equals("")){
             return true;
        }
        else{
            return false;
        }
    }
    public static boolean listIsNotNull(List  list){
        if(list!=null&&list.size()>0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean arrayIsNotNull(Object[]  array){
        if(array!=null&&array.length>0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean strIsNotNull(StringBuilder  str){
        //StringBuilder常用方法：
       /* StringBuilder strBuilder=new StringBuilder("JONES");
        strBuilder.append("HELLO");
        strBuilder.append("SMITH");

        strBuilder.length();//长度
        String res=strBuilder.toString();*/
        if(str!=null&&!str.toString().trim().equals("")){
            return true;
        }
        else{
            return false;
        }


    }
}
