package com.myhopu.atoz.index.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myhopu.atoz.Util.JdbcUtil;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/data")
public class dataController {


    @RequestMapping("/a6")
    public String map_t_data(Model model) throws JsonProcessingException {
        String sql = "select c.city,c.count from city_info c";
        JdbcUtil jdbcUtil = new JdbcUtil();
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> items = JdbcUtil.executeQuery(sql,null);
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        items.forEach((l) ->{
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("name",String.valueOf(l.get("city")));
            map.put("value",(Integer) l.get("count"));
            list.add(map);
        });
        return mapper.writeValueAsString(list);
    }

    public int f_x(String x){
        switch (x){
            case "无经验":return 0;
            case "不限":return 1;
            case "1年以下":return 2;
            case "1-3年":return 3;
            case "3-5年":return 4;
            case "5-10年":return 5;
            case "10年以上":return 6;
            case "学历不限":return 0;
            case "中技":return 1;
            case "中专":return 2;
            case "高中":return 3;
            case "大专":return 4;
            case "本科":return 5;
            case "硕士":return 6;
            case "博士":return 7;
        }
        return 0;
    }

    @RequestMapping("/a7")
    public String c_3d_1(Model model) throws JsonProcessingException {
        String sql = "select a.j_t, a.j_e, a.avg_sal from t_sh a";
        JdbcUtil jdbcUtil = new JdbcUtil();
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> items = JdbcUtil.executeQuery(sql,null);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        items.forEach((l) ->{
            List<Integer> ll = new ArrayList<Integer>();
            ll.add(f_x((String)l.get("j_t")));
            ll.add(f_x((String)l.get("j_e")));
            ll.add((Integer) l.get("avg_sal"));
            list.add(ll);
        });
        return mapper.writeValueAsString(list);
    }
    @RequestMapping("/a8")
    public String c_3d_2(Model model) throws JsonProcessingException {
        String sql = "select a.j_t, a.j_e, a.avg_sal from t_bj a";
        JdbcUtil jdbcUtil = new JdbcUtil();
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> items = JdbcUtil.executeQuery(sql,null);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        items.forEach((l) ->{
            List<Integer> ll = new ArrayList<Integer>();
            ll.add(f_x((String)l.get("j_t")));
            ll.add(f_x((String)l.get("j_e")));
            ll.add((Integer) l.get("avg_sal"));
            list.add(ll);
        });
        return mapper.writeValueAsString(list);
    }
    @RequestMapping("/a9")
    public String c_3d_3(Model model) throws JsonProcessingException {
        String sql = "select a.j_t, a.j_e, a.avg_sal from t_gz a";
        JdbcUtil jdbcUtil = new JdbcUtil();
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> items = JdbcUtil.executeQuery(sql,null);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        items.forEach((l) ->{
            List<Integer> ll = new ArrayList<Integer>();
            ll.add(f_x((String)l.get("j_t")));
            ll.add(f_x((String)l.get("j_e")));
            ll.add((Integer) l.get("avg_sal"));
            list.add(ll);
        });
        return mapper.writeValueAsString(list);
    }
    @RequestMapping("/a10")
    public String c_3d_4(Model model) throws JsonProcessingException {
        String sql = "select a.j_t, a.j_e, a.avg_sal from t_sz a";
        JdbcUtil jdbcUtil = new JdbcUtil();
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> items = JdbcUtil.executeQuery(sql,null);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        items.forEach((l) ->{
            List<Integer> ll = new ArrayList<Integer>();
            ll.add(f_x((String)l.get("j_t")));
            ll.add(f_x((String)l.get("j_e")));
            ll.add((Integer) l.get("avg_sal"));
            list.add(ll);
        });
        return mapper.writeValueAsString(list);
    }
    @RequestMapping("/a11")
    public String c_3d_5(Model model) throws JsonProcessingException {
        String sql = "select a.j_t, a.j_e, a.avg_sal from t_hz a";
        JdbcUtil jdbcUtil = new JdbcUtil();
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> items = JdbcUtil.executeQuery(sql,null);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        items.forEach((l) ->{
            List<Integer> ll = new ArrayList<Integer>();
            ll.add(f_x((String)l.get("j_t")));
            ll.add(f_x((String)l.get("j_e")));
            ll.add((Integer) l.get("avg_sal"));
            list.add(ll);
        });
        return mapper.writeValueAsString(list);
    }
    @RequestMapping("/a12")
    public String c_3d_6(Model model) throws JsonProcessingException {
        String sql = "select a.j_t, a.j_e, a.avg_sal from t_wh a";
        JdbcUtil jdbcUtil = new JdbcUtil();
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> items = JdbcUtil.executeQuery(sql,null);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        items.forEach((l) ->{
            List<Integer> ll = new ArrayList<Integer>();
            ll.add(f_x((String)l.get("j_t")));
            ll.add(f_x((String)l.get("j_e")));
            ll.add((Integer) l.get("avg_sal"));
            list.add(ll);
        });
        return mapper.writeValueAsString(list);
    }



}
