package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestBasicClassController {

  @RequestMapping("/")
  public String sayHello() {
    return "Hello World!";
  }
}
