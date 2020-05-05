package zhangjie.demo.mybatis.controller;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhangjie.demo.mybatis.domain.Bank;
import zhangjie.demo.mybatis.domain.User;
import zhangjie.demo.mybatis.domain.UserBank;
import zhangjie.demo.mybatis.mapper.BankMapper;
import zhangjie.demo.mybatis.mapper.UserMapper;

import javax.annotation.Resource;
import java.util.Map;

@RequestMapping("/user")
@RestController
public class UserRestController {
    @Resource
    private  UserMapper userMapper;

    @Resource
    private BankMapper bankMapper;


    @GetMapping("{id}")
    User getUser(@PathVariable Integer id) {
        return userMapper.findById(id);
    }

    @GetMapping("/bank/{id}")
    Bank getBank(@PathVariable Integer id) {
        return bankMapper.findById(id);
    }

    @GetMapping("/bank/combin/{uid}")
    UserBank getUserBank(@PathVariable Integer uid) {
        Map userBankmap = userMapper.findByUid(uid);

        return null;
    }


}
