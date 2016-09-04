package com.yxc.controller;

import com.yxc.model.UserEntity;
import com.yxc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
/**
 * Created by yangxiaochen on 16/9/3.
 */
@Controller
public class MainController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/index2" ,method = RequestMethod.GET)
    public String index() {
        return "index2";
    }

    @RequestMapping(value = "admin/users",method = RequestMethod.GET)
    public String getUsers(ModelMap modelMap) {
        // 查询user表中所有记录
        List<UserEntity> userList = userRepository.findAll();

        // 将所有记录传递给要返回的jsp页面，放在userList当中
        modelMap.addAttribute("userList", userList);

        // 返回pages目录下的admin/users.jsp页面
        return "admin/users";
    }
}
