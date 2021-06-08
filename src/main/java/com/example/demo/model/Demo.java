package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author chappidi srinath
 * @since 24-01-2021
 */
@Data
@Document(collection = "demo")
public class Demo {

    @Id
    private String id;
    private String name;
    private String email;
}
