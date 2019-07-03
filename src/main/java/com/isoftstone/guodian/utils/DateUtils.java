package com.isoftstone.guodian.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期操作
 * java.util.Date   new Date();
 * java.sql.Date   "1999-10-10" ->Date
 * java.util.Calendar日历类
 * 格式化日期：
 * SimpleDateFormat
 *
 *
 */
public class DateUtils {
    /**
     * 获取当前系统日期   2019-10-10
     */
    public static String getCurrentDate(){
        Date day_1=new Date();
        SimpleDateFormat simpFormat=new SimpleDateFormat("YYYY-MM-dd");
        String res= simpFormat.format(day_1);
        return res;
    }

    /***
     *获取系统时间“12:10:12”
     */
    public static String getCurrentTime(){
        Date day_1=new Date();
        SimpleDateFormat simpFormat=new SimpleDateFormat("HH:mm:ss");
        String res= simpFormat.format(day_1);
        return res;
    }
    /***
     *   任意一个日期所在周的周日日期
     */
public  static  String getWeekEndDate(String date){ //1999-10-10
        Calendar cal= Calendar.getInstance();

    try {

        java.sql.Date day  =java.sql.Date.valueOf(date);
        cal.setTime(day);
        System.out.println(  cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

        //获取星期
        int dayOfWeek= cal.get(Calendar.DAY_OF_WEEK) ;

        switch(dayOfWeek){
            case 1:dayOfWeek=7; break;
            case 2:  dayOfWeek=1; break;
            case 3:  dayOfWeek=2; break;
            case 4:  dayOfWeek=3; break;
            case 5:  dayOfWeek=4; break;
            case 6:  dayOfWeek=5; break;
            case 7:  dayOfWeek=6; break;
        }
        System.out.println(dayOfWeek);
        int addDays= 7-dayOfWeek;//添加的天数
        cal.add(Calendar.DAY_OF_MONTH,addDays);

        SimpleDateFormat simpFormat=new SimpleDateFormat("YYYY-MM-dd");
        return simpFormat.format(cal.getTime());

    } catch ( Exception e) {
        e.printStackTrace();
    }

    return null;
}

   /**
    * 获取任意日期，上一周，整周日期列表
    * */
   public static String[] getBeforeWeekDays(String dateStr){
             SimpleDateFormat simpFormat=new SimpleDateFormat("YYYY-MM-dd");
             String[] res=new String[7];
             String beforeSunDate=getWeekEndDate(dateStr); //本周周日日期
             Calendar cal=Calendar.getInstance();
             cal.setTime(java.sql.Date.valueOf(beforeSunDate)); //
             cal.add(Calendar.DAY_OF_MONTH,-7);  //上周日日期
            String date_7=simpFormat.format(cal.getTime()) ;
             cal.add(Calendar.DAY_OF_MONTH,-1);//上周六日期
             String date_6=simpFormat.format(cal.getTime()) ;
             cal.add(Calendar.DAY_OF_MONTH,-1);//上周5日期
            String date_5=simpFormat.format(cal.getTime()) ;
            cal.add(Calendar.DAY_OF_MONTH,-1);//上周4日期
             String date_4=simpFormat.format(cal.getTime()) ;
            cal.add(Calendar.DAY_OF_MONTH,-1);//上周3日期
            String date_3=simpFormat.format(cal.getTime()) ;
            cal.add(Calendar.DAY_OF_MONTH,-1);//上周2日期
            String date_2=simpFormat.format(cal.getTime()) ;
             cal.add(Calendar.DAY_OF_MONTH,-1);//上周1日期
            String date_1=simpFormat.format(cal.getTime()) ;
            res[0]=date_1;
            res[1]=date_2;
           res[2]=date_3;
           res[3]=date_4;
           res[4]=date_5;
           res[5]=date_6;
           res[6]=date_7;
       return res;
   }


   /***
    * 练习题：获取任意日期，下一周，整周日期列表
    * */


    public static void main(String args[]){
        String[] items=    DateUtils.getBeforeWeekDays("2019-05-26");
        for(int i=0;i<items.length;i++){
                      System.out.println(items[i]);
        }



    }



}
