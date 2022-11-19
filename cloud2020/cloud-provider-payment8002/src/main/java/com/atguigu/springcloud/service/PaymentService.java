package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Marbury
 * @date: 2022/6/26 8:57
 * 人生苦短，何妨一试，保持一种热爱，奔赴下一趟山海。
 */
public interface PaymentService {

    /**
     * 写操作
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 读操作
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
