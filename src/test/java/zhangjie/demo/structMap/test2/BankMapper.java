package zhangjie.demo.structMap.test2;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import zhangjie.demo.mybatis.domain.Bank;

import java.util.Map;

@Mapper
public interface BankMapper {
    BankMapper INSTANCE = Mappers.getMapper(BankMapper.class);

    Bank mapToBank(Map param);
}
