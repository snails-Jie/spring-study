package zhangjie.demo.beanUtils;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
import zhangjie.demo.mybatis.domain.Bank;
import zhangjie.demo.mybatis.domain.User;

import java.util.HashMap;
import java.util.Map;

public class CopyValueFromMap {
    @Test
    public void test() throws Exception{
        Bank bank = new Bank();
        User user = new User();
        Map map = new HashMap<>();
        map.put("id",1);
        map.put("uid",1);
        map.put("bankCode","ICBC");
        map.put("bankAccount","23424234235325");
        map.put("name","zhangjie");
        map.put("age",27);
        BeanUtils.populate(bank,map);
        BeanUtils.populate(user,map);
        System.out.println(bank.getBankAccount());
    }

}
