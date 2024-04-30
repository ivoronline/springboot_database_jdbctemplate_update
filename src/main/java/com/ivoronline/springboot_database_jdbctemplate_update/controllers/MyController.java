package com.ivoronline.springboot_database_jdbctemplate_update.controllers;

import com.ivoronline.springboot_database_jdbctemplate_update.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired private MyService myService;

  //=========================================================================================================
  // UPDATE
  //=========================================================================================================
  @ResponseBody
  @GetMapping("/update")
  public int update() {
    int    updatedRecords = myService.update("John New", "John", 10);
    return updatedRecords;
  }

}
