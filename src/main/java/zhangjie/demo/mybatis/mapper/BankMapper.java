package zhangjie.demo.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import zhangjie.demo.mybatis.domain.Bank;

@Mapper
public interface BankMapper {
    @Select("SELECT id,uid,bank_code bankCode,bank_account bankAccount  FROM bank WHERE id = #{id}")
    Bank findById(@Param("id") Integer id);
}
