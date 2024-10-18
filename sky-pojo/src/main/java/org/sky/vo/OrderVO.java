package org.sky.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sky.entity.OrderDetail;
import org.sky.entity.Orders;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderVO extends Orders implements Serializable {
    //订单菜品信息
    private String orderDishes;
    //订单详情
    private List<OrderDetail> orderDetailList;
}
