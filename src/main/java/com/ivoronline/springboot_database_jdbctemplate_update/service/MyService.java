package com.ivoronline.springboot_database_jdbctemplate_update.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyService {

  //PROPERTIES
  @Autowired private JdbcTemplate jdbcTemplate;

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
