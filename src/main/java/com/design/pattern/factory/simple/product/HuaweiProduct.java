package com.design.pattern.factory.simple.product;

/**
 * 子类-华为
 * @author 玄墨
 * @date 2021/6/21 5:04 下午
 */
public class HuaweiProduct extends MobileProduct {

    @Override
    public String display() {
        return "我是华为产品";
    }

    @Override
    public String feature() {
        return "美观，性价比还不错，竞争力提升很快";
    }
}
