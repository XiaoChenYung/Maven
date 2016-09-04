package com.yxc.controller;

import com.yxc.model.BlogEntity;
import com.yxc.model.UserEntity;
import com.yxc.repository.BlogRepository;
import com.yxc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import javax.persistence.SqlResultSetMapping;

/**
 * Created by yangxiaochen on 16/9/4.
 */
@Controller
public class BlogController {
    @Autowired
    BlogRepository blogRepository;

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/admin/blogs",method = RequestMethod.GET)
    public String showBlogs(ModelMap modelMap) {
        List<BlogEntity> blogList = blogRepository.findAll();
        modelMap.addAttribute("blogList", blogList);
        return "admin/blogs";
    }

    // 添加博文
    @RequestMapping(value = "/admin/blogs/add", method = RequestMethod.GET)
    public String addBlog(ModelMap modelMap) {
        List<UserEntity> userList = userRepository.findAll();
        // 向jsp注入用户列表
        modelMap.addAttribute("userList", userList);
        return "admin/addBlog";
    }

//    // 添加博文，POST请求，重定向为查看博客页面
//    @RequestMapping(value = "/admin/blogs/addP", method = RequestMethod.POST)
//    public String addBlogPost(@ModelAttribute("blog") BlogEntity blogEntity) {
//        // 打印博客标题
//        System.out.println(blogEntity.getTitle());
//        // 打印博客作者
//        System.out.println(blogEntity.getUserByUserId().getNickname());
//        // 存库
//        blogRepository.saveAndFlush(blogEntity);
//        // 重定向地址
//        return "redirect:/admin/blogs";
//    }

    @RequestMapping(value = "admin/blogs/addP",method = RequestMethod.POST)
    public String addBlogPost(@ModelAttribute("blog") BlogEntity blogEntity) {
         //打印博客标题
        System.out.println(blogEntity.getTitle());
        // 打印博客作者
        System.out.println(blogEntity.getUserByUserId().getNickname());
        // 存库
        blogRepository.saveAndFlush(blogEntity);
        // 重定向地址
        return "redirect:/admin/blogs";
    }

}
