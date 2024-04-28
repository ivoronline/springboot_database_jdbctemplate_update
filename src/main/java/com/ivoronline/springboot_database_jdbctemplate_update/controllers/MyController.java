package com.ivoronline.springboot_database_jdbctemplate_update.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired private JdbcTemplate jdbcTemplate;

  //=========================================================================================================
  // HELLO
  //=========================================================================================================
  @ResponseBody
  @GetMapping("/hello")
  public int  hello() {
    int    updatedRecords = update("John New", "John", 10);
    return updatedRecords;
  }

  //=========================================================================================================
  // UPDATE
  //=========================================================================================================
  public int update(String newName, String oldName, Integer age) {
    return jdbcTemplate.update(
      " UPDATE PERSON SET NAME = ? WHERE name = ? AND age = ?"   //Order of parameters is used => names are ignored
      , new Object[] { newName, oldName, age }
    );
  }

}
