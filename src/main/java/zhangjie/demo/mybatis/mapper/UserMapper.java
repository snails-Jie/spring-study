package zhangjie.demo.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import zhangjie.demo.mybatis.domain.User;

import java.util.Map;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE id = #{id}")
    User findById(@Param("id") Integer id);

    @Select("SELECT u.name,u.age,b.bank_code bankCode,b.bank_account bankAcccount FROM `user` u LEFT JOIN bank b ON u.id = b.uid where u.id =#{id}")
    Map findByUid(@Param("id") Integer id);
}
