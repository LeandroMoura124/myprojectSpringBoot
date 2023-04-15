package com.leandro.vscode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ola {
    @GetMapping(value="/")
    public String getMethodName() {
        return "Hello, Word!";
    }
    
}
