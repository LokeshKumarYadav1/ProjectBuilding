package com.project.HotelManagement.controller;

import com.project.HotelManagement.entity.HotelRecords;
import com.project.HotelManagement.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecordController {
    @Autowired
    private RecordService getAllRecord;
    private Object ResponseEntity;

    // To get all RECORD
   @GetMapping("/view")
   public List<HotelRecords> getRecords(){
       return this.getAllRecord.getRecords();
   }

   // To get single RECORD
   @GetMapping("/view/{customer}")
    public HotelRecords getRecords(@PathVariable String customerName)
   {
       return getAllRecord.getRecords(customerName);
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
       return this.getAllRecord.updateRecord(record);
   }

   @DeleteMapping("/view/{customer}")
    public ResponseEntity<HttpStatus> deleteRecord(@PathVariable String customer)
   {
       try{
           this.getAllRecord.deleteRecord(customer);
           return new ResponseEntity<>(HttpStatus.OK);
       }catch (Exception e){
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
   }
}
