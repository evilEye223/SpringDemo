package com.dcits.springcloud.service.impl;

import com.dcits.springcloud.dao.PaymentDao;
import com.dcits.springcloud.entities.Payment;
import com.dcits.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){

        return paymentDao.create(payment);
    };

    public Payment getPaymentById(Long id){

        return paymentDao.getPaymentById(id);
    };
}
