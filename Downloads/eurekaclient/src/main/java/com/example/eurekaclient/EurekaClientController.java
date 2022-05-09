package com.example.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    @GetMapping("/client1")
    public String printClient()
    {
        return "Client1";
    }

}
