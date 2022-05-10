package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 각 메소드마다 @ResponseBody 를 선언했던 것을 한번에 사용할 수 있게 해줌
public class HelloController {
    @GetMapping("/hello") // HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 줌
    public String hello(){
        return "hello";
    }
}
