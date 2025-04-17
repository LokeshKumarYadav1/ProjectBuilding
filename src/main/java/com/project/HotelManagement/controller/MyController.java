package com.project.HotelManagement.controller;

import com.project.HotelManagement.MyEntity.HotelRecords;
import com.project.HotelManagement.Service.Myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private Myservice getAllRecord;
    private Object ResponseEntity;

    // To get all RECORD
   @GetMapping("/view")
   public List<HotelRecords> GetRecord(){
       return this.getAllRecord.GetRecord();
   }

   // To get single RECORD
   @GetMapping("/view/{customer}")
    public HotelRecords GetRecord(@PathVariable String customer)
   {
       return getAllRecord.GetRecord(customer);
   }

   // To Add Record
   @PostMapping("/view")
    public HotelRecords AddRecord(@RequestBody HotelRecords record)
   {
       return this.getAllRecord.AddRecord(record);
   }

   @PutMapping("/view")
    public HotelRecords UpdateRecord(@RequestBody HotelRecords record)
   {
       return this.getAllRecord.UpdateRecord(record);
   }

   @DeleteMapping("/view/{customer}")
    public ResponseEntity<HttpStatus> DeleteRecord(@PathVariable String customer)
   {
       try{
           this.getAllRecord.DeleteRecord(customer);
           return new ResponseEntity<>(HttpStatus.OK);
       }catch (Exception e){
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
   }
}
