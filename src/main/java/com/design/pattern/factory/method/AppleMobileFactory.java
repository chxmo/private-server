package com.design.pattern.factory.method;

import com.design.pattern.factory.product.mobile.AppleMobileProduct;
import com.design.pattern.factory.product.mobile.MobileProduct;

/**
 * @author 玄墨
 * @date 2021/6/21 7:37 下午
 */
public class AppleMobileFactory extends AbstractMobileFactory {


    @Override
    public MobileProduct genarateProduct() {
        return new AppleMobileProduct();
    }
}
