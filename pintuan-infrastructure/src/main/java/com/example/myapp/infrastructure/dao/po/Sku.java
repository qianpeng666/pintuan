package com.example.myapp.infrastructure.dao.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品表的一些基本信息
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sku {

    private Long id;

    private String source;

    private String channel;

    private String goodsId;

    private String goodsName;

    private BigDecimal originalPrice;

    private Date createTime;

    private Date updateTime;


}
