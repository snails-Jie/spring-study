package zhangjie.demo.mvc.multiparam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhangjie.demo.mvc.Account;
import zhangjie.demo.mvc.Bank;

/**
 * 因为一个request中只包含一个request body
 *  -->spring MVC 不支持多个@RequestBody
 */
@RestController
@RequestMapping("/demo/multi")
public class DemoMultiParamController {

    @PostMapping("/hello")
    public String hello(@RequestBody String param) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        /**
         * 如果参数出现类中没有的字段会报错
         *  -->但是mapper.readValue(inputstream,javaType)不会出现
         */
        Account account = mapper.readValue(param,Account.class);
        Bank bank = mapper.readValue(param,Bank.class);
        return "hello";
    }

    @PostMapping("/test1")
    public String test1(@RequestBody PersonInfo personInfo){
        return "test1:"+personInfo.getAccount().getName();
    }


}
