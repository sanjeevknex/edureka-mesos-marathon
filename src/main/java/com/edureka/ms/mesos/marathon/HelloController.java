package com.edureka.ms.mesos.marathon;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sanjeev.singh1 on 27/04/18.
 */
@RestController(value = "/")
public class HelloController {

    @GetMapping
    @ResponseBody
    public String getMapping() {
        return "Hello world";
    }

}
