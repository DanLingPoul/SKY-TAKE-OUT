package org.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrdersCancelDTO implements Serializable {
    private Long id;
    //订单取消与原因
    private String cancelReason;

}
