package com.example.eurekaclient2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaClient2Controller {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/client2")
    public String printApp()
    {
        String name=restTemplate.getForObject("http://HOME-MICROSERVICE/client1",String.class);
        return name;
    }
}
