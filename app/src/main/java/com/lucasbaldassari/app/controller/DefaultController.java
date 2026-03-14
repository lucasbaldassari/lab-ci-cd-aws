package com.lucasbaldassari.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lucasbaldassari.app.service.DefaultService;

@RestController
public class DefaultController {

  private final DefaultService defaultService;

  public DefaultController(DefaultService defaultService) {
    this.defaultService = defaultService;
  }

  @GetMapping("/")
  public String index() {
    return defaultService.getIndexString();
  }

}
