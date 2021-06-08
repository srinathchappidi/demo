package com.example.demo.controller;

import com.example.demo.model.Demo;
import com.example.demo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author chappidi srinath
 * @since 24-05-2021
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private DemoService demoService;

    @PostMapping
    public ResponseEntity<Demo> createDemo(@RequestBody Demo demo){
        logger.info("Entered into Create Demo Controller Method");
        return new ResponseEntity<>(demoService.createDemo(demo), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Demo> getDemo(@PathVariable String id) {
        logger.info("Entered into Get Demo Controller Method");
        return new ResponseEntity<>(demoService.getDemo(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Demo>> getAllDemo(){
        logger.info("Entered into Get All Demo Controller Method");
        return new ResponseEntity<>(demoService.getAllDemo(), HttpStatus.OK);
    }
}
