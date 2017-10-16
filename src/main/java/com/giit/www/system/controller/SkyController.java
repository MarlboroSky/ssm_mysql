package com.giit.www.system.controller;

import com.giit.www.entity.Sky;
import com.giit.www.system.service.SkyBiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("sky.do")
public class SkyController {

    @Resource(name = "skyBizImpl")
    private SkyBiz skyBiz;
    @RequestMapping("sky.view")
    public String skyView(Model m){
        m.addAttribute("gameList", skyBiz.gameList());
        return "/admin/system/sky/sky";
    }

    @RequestMapping("game_add.view")
    public String skyAdd(Model m){
        m.addAttribute("gameList", skyBiz.gameList());
        return "/admin/system/sky/sky_add";
    }

    @RequestMapping("add")
    public String add(Sky sky){
        skyBiz.add(sky);
        return  "redirect:/sky.do/sky.view";
    }

    @RequestMapping("delete")
    public String delete(String game_id) {
        skyBiz.delete(game_id);
        return "redirect:/sky.do/sky.view";
    }

}
