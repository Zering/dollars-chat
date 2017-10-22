package com.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhanghaojie on 2017/10/22.
 *
 * hello测试
 *
 */
@RestController
public class HelloController {

  private static final Logger log = LoggerFactory.getLogger(HelloController.class);

  @GetMapping("/hello")
  public String hello(String name) {
    log.info("返回信息： Hello, " + name);
    return "Hello, " + name;
  }

}
