package com.increpas.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.increpas.db.dao.DeptDAO;
import com.increpas.db.vo.DeptVO;

@Controller
public class DeptController {

    @Autowired
    private DeptDAO deptDAO;

    //public static final String VIEW_PATH = "/WEB-INF/views/dept/";

    @GetMapping("/")
    public String list(Model model) {

        List<DeptVO> list = deptDAO.selectList();
        model.addAttribute("list", list);
        return "dept_list";
    }
}
