package com.isoftstone.guodian.demo.control;


import com.isoftstone.guodian.demo.entity.EmpEntity;
import com.isoftstone.guodian.demo.service.EmpService;
import com.isoftstone.guodian.utils.PageUtils;
//import com.sun.javafx.sg.PGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by issuser on 2019/7/1.
 */
@Controller  //控制层闯将bean，即让spring实例化这个 类
public class EmpControl {
    //获取EmpService 实例
    @Autowired
    private EmpService empService;

    //加载首页main.jsp
    @RequestMapping("/")   //定义页面访问的url
    public String loadMainPage(){
          //处理业务
        System.out.println("查询。。。。。");
        return "/main.jsp";   //默认服务器端跳转（一般我们跳转页面） “redirect:/sdfdf” 客户端跳转

    }
    @RequestMapping("/emp/selectEmpList")
    public String selectEmpList(Integer pageNow , Model model){//通过参数接受页面请求数据，参数变量名与前台标签name属性名一样即可


        EmpEntity entity=new EmpEntity();
        try {
            PageUtils page = new PageUtils();
             if(pageNow==null){
                 pageNow=1;
             }
            page.setPageNow(pageNow);
            page.setTotal(empService.selectTotal(null));
            entity.setPageUtils(page);
            List<EmpEntity> list = empService.selectForPage(entity);
               model.addAttribute("rows",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "/demo/demo_select.jsp";
    }
}
