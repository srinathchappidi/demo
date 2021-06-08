package com.example.demo.service;

import com.example.demo.model.Demo;
import com.example.demo.repository.DemoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author chappidi srinath
 * @since 24-05-2021
 */
@Service
public class DemoServiceImpl implements DemoService{

    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Autowired
    private DemoRepository demoRepository;

    @Override
    public Demo createDemo(Demo demo) {
        logger.info("Entered into Create Demo Service Method");
         return demoRepository.save(demo);
    }

    @Override
    public Demo getDemo(String id) {
        logger.info("Entered into Get Demo Service Method");
        Optional<Demo> demo = demoRepository.findById(id);
        return demo.get();
    }

    @Override
    public List<Demo> getAllDemo() {
        logger.info("Entered into GetAll Demo Service Method");
        return demoRepository.findAll();
    }
}
