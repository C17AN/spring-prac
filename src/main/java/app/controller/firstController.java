package app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * firstController
 */
@RestController
public class firstController {

    @RequestMapping("/hello")
    public String Hello() {
        return "Hello, haha";
    }
}