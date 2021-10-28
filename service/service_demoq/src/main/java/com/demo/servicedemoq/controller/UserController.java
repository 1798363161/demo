package com.demo.servicedemoq.controller;


import com.demo.servicedemoq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author demo
 * @since 2021-10-27
 */
@RestController
@RequestMapping("/servicedemoq/user")
public class UserController {

    @Value("${mail.fromMail.sender}")
    private String sender;// 发送者


    @Autowired
    private UserService userService;

    @Autowired
    private JavaMailSender javaMailSender;

    @GetMapping("findAll")
    public void findAll() {

        SimpleMailMessage message = new SimpleMailMessage();
        String code = VerifyCode(6);
        message.setFrom(sender);
        message.setTo("1798363161@qq.com");
        message.setText(code);
        message.setSubject("123456");
        javaMailSender.send(message);
        System.out.println(code);

        //return R.ok().data("items",userService.list(null));
    }

    private String VerifyCode(int n) {
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            int ran1 = r.nextInt(10);
            sb.append(String.valueOf(ran1));
        }
//        System.out.println(sb);

        return sb.toString();
    }
}



