package com.alberto.spring.basic.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alberto.spring.basic.springin5steps.BinarySearchImpl;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {
    private static final Logger LOG = LoggerFactory.getLogger(SpringIn5StepsApplication.class);
    public static void main(String[] args) {




        ApplicationContext applicationContext =SpringApplication.run(SpringIn5StepsApplication.class, args);
        BinarySearchImpl binarySearch =
                applicationContext.getBean(BinarySearchImpl.class);
        int result=binarySearch.binarySearch(new int[]{12,4,6},3);
        LOG.info("**************************************+",String.valueOf(result));
    }

}
