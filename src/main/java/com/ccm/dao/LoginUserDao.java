package com.ccm.dao;

import com.ccm.entity.LoginUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (LoginTest)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-23 16:30:20
 */
public interface LoginUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LoginUser queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<LoginUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param loginTest 实例对象
     * @return 对象列表
     */
    List<LoginUser> queryAll(LoginUser loginUser);

    /**
     * 新增数据
     *
     * @param loginTest 实例对象
     * @return 影响行数
     */
    int insert(LoginUser loginUser);

    /**
     * 修改数据
     *
     * @param loginTest 实例对象
     * @return 影响行数
     */
    int update(LoginUser loginUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}