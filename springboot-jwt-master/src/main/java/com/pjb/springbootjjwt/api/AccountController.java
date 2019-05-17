package com.pjb.springbootjjwt.api;

import com.alibaba.fastjson.JSON;
import com.pjb.springbootjjwt.entity.SysUser;
import com.pjb.springbootjjwt.utils.JwtUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = {"/account"})
public class AccountController {

    @PostMapping(value = {"/sign-in"})
    public String signIn(SysUser sysUser) {
        System.out.println("登录接口====" + JSON.toJSONString(sysUser));
        String username = sysUser.getUsername();
        String password = sysUser.getPassword();

//        userService.signIn(sysUser);

//        String token= JWTUtil.sign(username,password);
        String token = JwtUtils.getToken(username);
        System.out.println("生成token==" + token);
        //System.out.println("返回数据="+ResponseResult.e(ResponseCode.SIGN_IN_OK,((JwtToken) SecurityUtils.getSubject().getPrincipal()).getToken()));

        return token;
    }

    //    @UserLoginToken
    @RequestMapping(value = "/hello")
    public String hello() {
        return "你已通过验证";
    }

    @RequestMapping(value = "/yichang")
    public String index() throws Exception {
        String name = null;
        if (name == null) {
            System.out.println("空");
            throw new Exception();
//            throw new MyException("1001","empty","在获取用户名字的时候为空");
        } else {
            return "hahahha";
        }


    }


}