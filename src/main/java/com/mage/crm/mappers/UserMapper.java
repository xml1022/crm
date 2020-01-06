package com.mage.crm.mappers;

import com.mage.crm.po.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from t_user where is_valid=1")
    List<User> findAll();
}
