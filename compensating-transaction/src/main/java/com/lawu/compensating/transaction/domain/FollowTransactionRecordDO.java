package com.lawu.compensating.transaction.domain;

import java.io.Serializable;
import java.util.Date;

public class FollowTransactionRecordDO implements Serializable {
    /**
     *
     * 主键
     * follow_transaction_record.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 事务记录id
     * follow_transaction_record.transation_id
     *
     * @mbg.generated
     */
    private Long transationId;

    /**
     *
     * MQ消息的topic
     * follow_transaction_record.topic
     *
     * @mbg.generated
     */
    private String topic;

    /**
     *
     * 创建时间
     * follow_transaction_record.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table follow_transaction_record
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column follow_transaction_record.id
     *
     * @return the value of follow_transaction_record.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column follow_transaction_record.id
     *
     * @param id the value for follow_transaction_record.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column follow_transaction_record.transation_id
     *
     * @return the value of follow_transaction_record.transation_id
     *
     * @mbg.generated
     */
    public Long getTransationId() {
        return transationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column follow_transaction_record.transation_id
     *
     * @param transationId the value for follow_transaction_record.transation_id
     *
     * @mbg.generated
     */
    public void setTransationId(Long transationId) {
        this.transationId = transationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column follow_transaction_record.topic
     *
     * @return the value of follow_transaction_record.topic
     *
     * @mbg.generated
     */
    public String getTopic() {
        return topic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column follow_transaction_record.topic
     *
     * @param topic the value for follow_transaction_record.topic
     *
     * @mbg.generated
     */
    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column follow_transaction_record.gmt_create
     *
     * @return the value of follow_transaction_record.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column follow_transaction_record.gmt_create
     *
     * @param gmtCreate the value for follow_transaction_record.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}