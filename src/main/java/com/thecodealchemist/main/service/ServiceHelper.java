package com.thecodealchemist.main.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceHelper {

    @Transactional(propagation = Propagation.NEVER)
    public void m1() {
        System.out.println("Calling m1......");
    }


}
