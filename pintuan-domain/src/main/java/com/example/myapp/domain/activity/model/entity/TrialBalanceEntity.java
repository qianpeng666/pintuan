package com.example.myapp.domain.activity.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TrialBalanceEntity {
    private String goodsId;
    private String goodsName;
    private BigDecimal originalPrice;
    private BigDecimal deductionPrice;
    private Integer targetCount;
    private Data startTime;
    private Data endTime;
    private Boolean isVisible;
    private Boolean isEnable;
}
