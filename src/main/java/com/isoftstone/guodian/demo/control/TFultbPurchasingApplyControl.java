package com.isoftstone.guodian.demo.control;

import com.isoftstone.guodian.demo.service.TFultbPurchasingApplyService;
import com.isoftstone.guodian.entity.TFultbpurchasingapplyEntity;
import com.isoftstone.guodian.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Classname TFultbPurchasingApplyControl
 * @Description TODO
 * @auther daijiankun laptop
 * @create 2019-07-07 12:29 PM
 */

@Controller
public class TFultbPurchasingApplyControl {

    @Autowired
    private TFultbPurchasingApplyService tFultbPurchasingApplyService;

    @RequestMapping("/apply/createPurchaseApply")
    public String createPurchaseApply() {
        return "/purchaseApply/apply_create.jsp";
    }

    @RequestMapping("/apply/queryPurchaseApply")
    public String queryPurchaseApply(Integer pageNow, Model model) {
        TFultbpurchasingapplyEntity tFultbpurchasingapplyEntity
                = new TFultbpurchasingapplyEntity();
        try {
            PageUtils page = new PageUtils();
            if(pageNow == null){
                pageNow = 1;
            }
            page.setPageNow(pageNow);
            page.setTotal(tFultbPurchasingApplyService.selectTotal(null));
            tFultbpurchasingapplyEntity.setPageUtils(page);
            List<TFultbpurchasingapplyEntity> list = tFultbPurchasingApplyService.selectForPage(tFultbpurchasingapplyEntity);
            model.addAttribute("applyList", list);

            for (int i = 0; i < list.size(); i++) {
                System.out.println("###########" + list.get(i));
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        return "/purchaseApply/apply_select.jsp";
    }
}
