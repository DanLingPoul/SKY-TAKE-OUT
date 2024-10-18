package org.sky.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GoodSalesDTO implements Serializable {
    //商品名称
    private String name;
    //销量
    private Integer number;
}
