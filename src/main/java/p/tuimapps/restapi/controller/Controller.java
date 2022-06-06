package p.tuimapps.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }
    @GetMapping("/restricted")
    public String restricted() {
        return "U' re logged in";
    }
    @GetMapping("/not-restricted")
    public String notRestricted() {
        return "you don't need to be logged in";
    }
}
