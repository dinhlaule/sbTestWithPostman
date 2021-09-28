package com.neo.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neo.dto.NewDTO;

@RestController
public class NewAPI {

   @RequestMapping(value = "/new", method = RequestMethod.POST)
   @ResponseBody
   public NewDTO createNew(@RequestBody NewDTO model) {
      return model;
   }
}