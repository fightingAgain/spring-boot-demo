package com.example.rabbitmq;

import java.io.Serializable;

/**
 * Created by liuhui on 2016/2/19.
 */
public class RabbitVO implements Serializable{

    private String id;

    private String desc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "RabbitVO{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
