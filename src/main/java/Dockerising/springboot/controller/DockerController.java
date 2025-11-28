package Dockerising.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DockerController {

    @GetMapping("/docker")
    public String docker(){
        return "Dockerizing the spring boot application";
    }

}
