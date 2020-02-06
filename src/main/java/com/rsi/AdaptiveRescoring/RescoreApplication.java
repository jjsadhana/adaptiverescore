package com.rsi.AdaptiveRescoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jayachandranj on 2020-02-05
 */
@RestController
@SpringBootApplication
public class RescoreApplication {

    @RequestMapping("/")
    String home(){
        return "Adaptive Rescoring";
    }
    public static void main(String  a[]){
        SpringApplication.run(RescoreApplication.class,a);
    }
}
