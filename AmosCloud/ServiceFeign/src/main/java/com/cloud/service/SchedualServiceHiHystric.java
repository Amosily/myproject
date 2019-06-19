package com.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @Desc：
 * @Author: wangk
 * @Date: 2019/6/18 16:52
 */
@Component
public class SchedualServiceHiHystric  implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
