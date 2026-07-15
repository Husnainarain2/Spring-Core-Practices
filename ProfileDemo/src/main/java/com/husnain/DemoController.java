package com.husnain;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Demo")
public class DemoController {

    private String name;
    private String message;

    @GetMapping
    public ResponseEntity<String> demo() {
        System.out.println("Name: " + name);
        System.out.println("Message: " + message);
        return ResponseEntity.ok("Demo executed successfully");
    }

}
