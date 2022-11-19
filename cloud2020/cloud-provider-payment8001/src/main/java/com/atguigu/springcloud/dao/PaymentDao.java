package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Marbury
 * @date: 2022/6/25 22:14
 * 人生苦短，何妨一试，保持一种热爱，奔赴下一趟山海。
 */
@Mapper
public interface PaymentDao {

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
