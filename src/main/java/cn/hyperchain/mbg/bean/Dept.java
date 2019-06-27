package cn.hyperchain.mbg.bean;

import java.io.Serializable;
import java.util.Date;

public class Dept implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dept.DEPT_ID
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    private Long deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dept.PARENT_ID
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dept.DEPT_NAME
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    private String deptName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dept.ORDER_NUM
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    private Long orderNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dept.CREATE_TIME
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_dept
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dept.DEPT_ID
     *
     * @return the value of t_dept.DEPT_ID
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dept.DEPT_ID
     *
     * @param deptId the value for t_dept.DEPT_ID
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dept.PARENT_ID
     *
     * @return the value of t_dept.PARENT_ID
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dept.PARENT_ID
     *
     * @param parentId the value for t_dept.PARENT_ID
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dept.DEPT_NAME
     *
     * @return the value of t_dept.DEPT_NAME
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dept.DEPT_NAME
     *
     * @param deptName the value for t_dept.DEPT_NAME
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dept.ORDER_NUM
     *
     * @return the value of t_dept.ORDER_NUM
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    public Long getOrderNum() {
        return orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dept.ORDER_NUM
     *
     * @param orderNum the value for t_dept.ORDER_NUM
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dept.CREATE_TIME
     *
     * @return the value of t_dept.CREATE_TIME
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dept.CREATE_TIME
     *
     * @param createTime the value for t_dept.CREATE_TIME
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Thu Jun 27 17:19:19 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deptId=").append(deptId);
        sb.append(", parentId=").append(parentId);
        sb.append(", deptName=").append(deptName);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}