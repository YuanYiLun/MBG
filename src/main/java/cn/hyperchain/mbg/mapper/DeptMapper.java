package cn.hyperchain.mbg.mapper;

import cn.hyperchain.mbg.bean.Dept;
import java.util.List;

public interface DeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    int deleteByPrimaryKey(Long deptId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    int insert(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    Dept selectByPrimaryKey(Long deptId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    List<Dept> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    int updateByPrimaryKey(Dept record);
}