package com.example.demo.service;

import com.example.demo.model.Demo;

import java.util.List;

/**
 * @author chappidi srinath
 * @since 24-05-2021
 */
public interface DemoService {

    public Demo createDemo(Demo demo);
    public Demo getDemo(String id);
    public List<Demo> getAllDemo();
}
