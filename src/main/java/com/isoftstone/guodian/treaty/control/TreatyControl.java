package com.isoftstone.guodian.treaty.control;

import com.isoftstone.guodian.demo.entity.EmpEntity;
import com.isoftstone.guodian.treaty.entity.TreatyEntity;
import com.isoftstone.guodian.utils.PageUtils;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName TreatyControl
 * @Description TODO
 * @Author qi
 * @Date 2019/7/4 13:59
 * @ModifyDate 2019/7/4 13:59
 * @Version 1.0
 */
@Controller
public class TreatyControl {

    @RequestMapping("/treaty/treatycontrol")
    public String text(){
        return "/demo/demo_treaty.jsp";
    }
    @RequestMapping("/treaty/submit")
    public String submit(HttpServletRequest req, Model model){

        TreatyEntity treatyEntity = new TreatyEntity();

        treatyEntity.setStatus(1);
        treatyEntity.setTreatyid(req.getParameter("treatyid"));
        /*treatyEntity.setSignaturedate(req.getParameter("signaturedate").toString());*/
        treatyEntity.setName1(req.getParameter("name1"));
        treatyEntity.setName2(req.getParameter("name2"));
        /*int trType = Integer.parseInt(req.getParameter("transType"));
        treatyEntity.setTransType(trType);*/
        /*int trType = Integer.parseInt(req.getParameter("transType"));
        treatyEntity.setCheckType(Integer.valueOf(req.getParameter("checkType")));*/


        treatyEntity.setRemarks(req.getParameter("remarks"));

        System.out.println(req.getParameter("treatyid"));
        treatyEntity.show();
        return "/demo/demo_treaty.jsp";
    }
}



