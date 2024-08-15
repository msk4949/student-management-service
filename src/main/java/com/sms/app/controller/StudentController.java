package com.sms.app.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/student")
@Slf4j
public class StudentController {

    @GetMapping("/{name}")
    public ResponseEntity<String> getStudent(@PathVariable("name") String name) {
        log.info("Get Customer By Id {} ", name);
        return ResponseEntity.ok("Hello "+name);
    }


}
