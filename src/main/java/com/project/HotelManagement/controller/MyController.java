package com.project.HotelManagement.controller;

import com.project.HotelManagement.MyEntity.Records;
import com.project.HotelManagement.Service.Myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private Myservice getAllRecord;
   @GetMapping("/view")
   public List<Records> GetCourse(){
       return this.getAllRecord.GetRecord();
   }

   @GetMapping("/view/{customer}")
    public Records GetRecord(String cust)
   {
       return getAllRecord.GetRecord(cust);
   }

}
