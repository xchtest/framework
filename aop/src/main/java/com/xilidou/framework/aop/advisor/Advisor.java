package com.xilidou.framework.aop.advisor;


import lombok.Data;

@Data
public class Advisor {

    /**
     * 切面的行为
     */
    private Advice advice;

    /**
     * 切面点
     */
    private Pointcut pointcut;

}
