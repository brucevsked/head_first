/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.adapter.impl;

import com.github.siemen.adapter.Duck;

/**
 * <b>描述：鸭子实现</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-23<br/>
 *
 */
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack......");
    }

    public void fly() {

        System.out.println("I'm flying.....");

    }
}