package com.example.mqtt.demo;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * 启动类
 */
@SpringBootApplication
@Slf4j
public class MqttDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqttDemoApplication.class, args);
    }

}
