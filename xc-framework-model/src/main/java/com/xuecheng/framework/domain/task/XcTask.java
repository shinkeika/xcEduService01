package com.xuecheng.framework.domain.task;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@ToString
@Entity
@Table(name = "xc_task")
//@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class XcTask implements Serializable {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
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
    private Integer version;
    private String status;
    private String errormsg;

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

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
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

    public Integer getVersion() {
        return version;
    }

    public String getStatus() {
        return status;
    }

    public String getErrormsg() {
        return errormsg;
    }
}
