package com.xuecheng.framework.domain.task;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by mrt on 2018/4/4.
 */
@Data
@ToString
@Entity
@Table(name = "xc_task_his")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class XcTaskHis implements Serializable {

    @Id
    @GeneratedValue(generator = "jpa-assigned")
    @Column(length = 32)
    private String id;

    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "update_time")
    private Date updateTime;
    @Column(name = "delete_time")
    private Date deleteTime;
    @Column(name = "task_type")
    private String taskType;
    @Column(name = "mq_exchange")
    private String mqExchange;
    @Column(name = "mq_routingkey")
    private String mqRoutingkey;
    @Column(name = "request_body")
    private String requestBody;
    private String version;
    private String status;

    public void setId(String id) {
        this.id = id;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public void setMqExchange(String mqExchange) {
        this.mqExchange = mqExchange;
    }

    public void setMqRoutingkey(String mqRoutingkey) {
        this.mqRoutingkey = mqRoutingkey;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public String getTaskType() {
        return taskType;
    }

    public String getMqExchange() {
        return mqExchange;
    }

    public String getMqRoutingkey() {
        return mqRoutingkey;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public String getVersion() {
        return version;
    }

    public String getStatus() {
        return status;
    }
}
