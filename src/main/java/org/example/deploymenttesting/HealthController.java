package org.example.deploymenttesting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HealthController {

    @GetMapping
    public String check(){
        return "Server running ....... hosted from repo2cloud";
    }

}
