package com.example.myapp.domain.activity.service.discount;

import com.example.myapp.domain.activity.model.valobj.DiscountTypeEnum;
import com.example.myapp.domain.activity.model.valobj.GroupBuyActivityDiscountVO;

import java.math.BigDecimal;

public abstract class AbstractDiscountCalculateService implements IDiscountCalculateService{
    @Override
    public BigDecimal calculate(String userId, BigDecimal originalPrice, GroupBuyActivityDiscountVO.GroupBuyDiscount groupBuyDiscount) {
        //获取下人群标签是不是在范围内，在就做计算，不在就返回原价格
        if(DiscountTypeEnum.TAG.equals(groupBuyDiscount.getDiscountType())){
            boolean isCrowRange =filterTagId(userId,groupBuyDiscount.getTagId());
            if(!isCrowRange) return originalPrice;
        }

        return doCalculate(originalPrice,groupBuyDiscount);
    }

    //给子类做对应实现
    protected abstract BigDecimal doCalculate(BigDecimal originalPrice, GroupBuyActivityDiscountVO.GroupBuyDiscount groupBuyDiscount);

    private boolean filterTagId(String userId, String tagId) {
        return true;
    }
    
}
