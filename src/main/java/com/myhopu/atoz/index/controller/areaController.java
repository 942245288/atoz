package com.myhopu.atoz.index.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myhopu.atoz.Util.JdbcUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Controller
@RequestMapping("/area")
public class areaController {

    @RequestMapping("/")
    public String re_index(Model model){
        return "area.html";
    }

    @RequestMapping("/a0")
    public String area0(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a0");
        return "charts/五大城市前20职位图.html";
    }
    @RequestMapping("/a1")
    public String area1(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a1");
        return "charts/上海市.html";
    }
    @RequestMapping("/a2")
    public String area2(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a2");
        return "charts/北京市.html";
    }
    @RequestMapping("/a3")
    public String area3(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a3");
        return "charts/天津市.html";
    }
    @RequestMapping("/a4")
    public String area4(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a4");
        return "charts/广东省.html";
    }
    @RequestMapping("/a5")
    public String area5(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a5");
        return "charts/湖北省.html";
    }

    @RequestMapping("/a6")
    public String map_t(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a6");
        return "charts/全国主要城市岗位分布图.html";
    }

    @RequestMapping("/a7")
    public String c_3d_1(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a7");
        return "charts/bar3d.html";
    }

    @RequestMapping("/a8")
    public String c_3d_2(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a8");
        return "charts/bar3d.html";
    }

    @RequestMapping("/a9")
    public String c_3d_3(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a9");
        return "charts/bar3d.html";
    }

    @RequestMapping("/a10")
    public String c_3d_4(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a10");
        return "charts/bar3d.html";
    }

    @RequestMapping("/a11")
    public String c_3d_5(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a11");
        return "charts/bar3d.html";
    }

    @RequestMapping("/a12")
    public String c_3d_6(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a12");
        return "charts/bar3d.html";
    }

    @RequestMapping("/a13")
    public String c_sal_1(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a13");
        return "charts/学历与公司规模 岗位占比(1).html";
    }

    @RequestMapping("/a14")
    public String c_sal_2(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a14");
        return "charts/经验与公司规模 岗位占比(1).html";
    }
    @RequestMapping("/a15")
    public String c_sal_3(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a15");
        return "charts/经验与公司规模 岗位占比(1).html";
    }
    @RequestMapping("/a16")
    public String c_big_1(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a16");
        return "charts/大数据学历经验.html";
    }
    @RequestMapping("/a17")
    public String c_big_2(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a17");
        return "charts/大数据热门城市平均薪资.html";
    }
    @RequestMapping("/a18")
    public String c_big_3(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a18");
        return "charts/大数据热门城市平均薪资.html";
    }
    @RequestMapping("/a19")
    public String c_big_4(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a19");
        return "charts/六大城市大数据职位分布图.html";
    }
    @RequestMapping("/a20")
    public String c_big_5(Model model) throws JsonProcessingException {
        model.addAttribute("data_url","a20");
        return "charts/大数据相关职位分布.html";
    }


}
