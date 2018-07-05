package syl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import syl.domain.Items;
import syl.service.Itemservice;

import java.util.List;

@Controller
@RequestMapping("/items")
public class itemController {
    @Autowired
    private Itemservice itemservice;

    @RequestMapping("/queryItems.action")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView();
        List<Items> list = itemservice.findAll();
        mv.addObject("itemsList", list);
        mv.setViewName("itemsList");
        return mv;
    }

    @RequestMapping("/updateItems.action")
    public String updateItems( Items items) {
        System.out.println(items);
        itemservice.updateItems(items);
        return "redirect:/items/queryItems.action";
    }

    @RequestMapping("/editItems.action")
    public ModelAndView findByid(String id) {
        ModelAndView mv = new ModelAndView();
        Items items = itemservice.findByid(id);
        mv.addObject("items", items);
        mv.setViewName("editItems");
        return mv;
    }
}
