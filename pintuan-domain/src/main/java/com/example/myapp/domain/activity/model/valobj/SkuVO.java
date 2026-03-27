package com.example.myapp.domain.activity.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SkuVO {

    private String goodsId;

    private String goodsName;

    private BigDecimal originalPrice;

}
