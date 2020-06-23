package com.it.ssm.dao;

import com.it.ssm.domain.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author fairness
 * @date 2020/6/23 - 22:44
 */
public interface RoleDao {

    //根据用户id查询出所有对应的角色
    @Select("select * from role where id in (select roleId from users_role where userId=#{userId})")
    List<Role> findRoleByUserId(String userId);
}
