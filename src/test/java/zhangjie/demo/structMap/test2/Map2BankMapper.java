package zhangjie.demo.structMap.test2;

import org.junit.Test;
import zhangjie.demo.mybatis.domain.Bank;

import java.util.HashMap;
import java.util.Map;

public class Map2BankMapper {

    @Test
    public void test(){
        Map map = new HashMap<>();
        map.put("id",1);
        map.put("uid",1);
        map.put("bankCode","ICBC");
        map.put("bankAccount","23424234235325");

        Bank bank =BankMapper.INSTANCE.mapToBank(map);
        System.out.println(bank.getBankAccount());

    }
}
