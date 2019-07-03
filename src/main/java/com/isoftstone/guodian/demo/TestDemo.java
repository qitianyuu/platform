package com.isoftstone.guodian.demo;

import com.isoftstone.guodian.demo.entity.EmpEntity;
import com.isoftstone.guodian.demo.service.EmpService;
import com.isoftstone.guodian.utils.PageUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by issuser on 2019/7/1.
 */
public class TestDemo {
    public static void main(String args[]){


      EmpService service=
              (EmpService) new ClassPathXmlApplicationContext("spring_config.xml").getBean("empService");
        EmpEntity e=new EmpEntity();
        e.setDname("财务100");
        e.setEname("JONES100");
        e.setJob("专员100");
        e.setHiredate(Date.valueOf("2018-10-10"));
        e.setSal(new BigDecimal("3000"));
        try {
           //service.saveEntity(e);
           /* List<EmpEntity> list=  service.selectALL(null);
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i).getEname());
            }*/
            /*StringBuffer sql=new StringBuffer(" and ename like '%100%' ") ;
            EmpEntity entity=new EmpEntity();
            entity.setWhereSql(sql);
            PageUtils page=new PageUtils();
            page.setPageNow(1);
            page.setTotal(service.selectTotal(entity));
            entity.setPageUtils(page);
            List<EmpEntity> list=service.selectForPage(entity);
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i).getEname());
            }*/

            StringBuffer sql=new StringBuffer(" and emp.ename like '%J%'");
            EmpEntity entity=new EmpEntity();
            entity.setWhereSql(sql);
            List<Map<String,Object>> list=service.selectEmpDept(entity);
            for(int i=0;i<list.size();i++){
                Map<String,Object> map=list.get(i);
              System.out.println (  map.get("e_name")+":"+map.get("e_des") );
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }


    }
}
