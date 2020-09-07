package com.br.ms.communication.buytrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.elastic.apm.attach.ElasticApmAttacher;



@SpringBootApplication
public class ApplicationBuyTrip {

    public static void main(String[] args) {
    	ElasticApmAttacher.attach();
        SpringApplication.run(ApplicationBuyTrip.class, args);
    }

}