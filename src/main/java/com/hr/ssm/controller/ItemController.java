package com.hr.ssm.controller;

import com.hr.ssm.pojo.Item;
import com.hr.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/showItem/{id}")
    private String findById(@PathVariable("id") int id, Model model) {
        Item item = itemService.findById(id);
        model.addAttribute("item",item);
        return "item";

    }
}
