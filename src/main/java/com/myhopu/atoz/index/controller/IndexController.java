package com.myhopu.atoz.index.controller;

import com.myhopu.atoz.Util.JdbcUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String re_index(){
        return "index.html";
    }

    @RequestMapping("/index")
    public String index(){
        return "index.html";
    }


    @RequestMapping("/t1")
    public String t1(Model model){
        List<String> col_n = Arrays.asList("城市,省份,地区,平均薪资,工作岗位,公司数量".split(","));
        String sql = "select a.city, a.pcv_name, a.area_name, a.avg, a.count, a.count_c from job_db.city_info a where pcv_name not in ('不明')  order by count desc limit 50";
        JdbcUtil jdbcUtil = new JdbcUtil();
        List<Map<String, Object>> items = JdbcUtil.executeQuery(sql,null);
        model.addAttribute("col_n",col_n);
        model.addAttribute("items",items);
        model.addAttribute("table_num","1");
        return "_table.html";
    }

    @RequestMapping("/t2")
    public String t2(Model model){
        List<String> col_n = Arrays.asList("福利名称,公司数目,岗位大类,岗位数目".split(","));
        String sql = "select welfare,c_count,j_cate_l,count from welfare_info where c_count > 50";
        JdbcUtil jdbcUtil = new JdbcUtil();
        List<Map<String, Object>> items = JdbcUtil.executeQuery(sql,null);
        model.addAttribute("col_n",col_n);
        model.addAttribute("items",items);
        model.addAttribute("table_num","2");
        return "_table.html";
    }

    @RequestMapping("/t3")
    public String t3(Model model){
        List<String> col_n = Arrays.asList("岗位类别,所属大类,最高薪资,最低薪资,城市岗位数,平均薪资,学历,经验要求".split(","));
        String sql = "select a.j_cate_s, a.j_cate_l, a.sal_max, a.sal_min, a.j_c_count, a.sal_avg, a.j_e, a.j_t from job_db.sal_infore a where a.sal_min > 2000";
        JdbcUtil jdbcUtil = new JdbcUtil();
        List<Map<String, Object>> items = JdbcUtil.executeQuery(sql,null);
        model.addAttribute("col_n",col_n);
        model.addAttribute("items",items);
        model.addAttribute("table_num","3");
        return "_table.html";
    }


//    @index_bp.route('/t2')
//    def welfare():
//    col_n = ('福利名称', '公司数目', '岗位大类', '岗位数目')
//    sql = 'select welfare,c_conunt,j_cate_l,count from welfare_info where c_conunt > 50;'
//    db_n = 'job_db'
//    items = select_t(sql, db_n)
//    return render_template('_table.html', items=items, col_n=col_n)
//
//
//    @index_bp.route('/t3')
//    def salary():
//    col_n = ('岗位类别', '所属大类', '最高薪资', '最低薪资', '城市岗位数', '平均薪资', '学历', '经验要求')
//    sql = 'select a.j_cate_s, a.j_cate_l, a.sal_max, a.sal_min, a.j_c_count, a.sal_avg, a.j_e, a.j_t from job_db.sal_infore a where a.sal_min > 2000;'
//    db_n = 'job_db'
//    items = select_t(sql, db_n)
//    return render_template('_table.html', items=items, col_n=col_n)
}
