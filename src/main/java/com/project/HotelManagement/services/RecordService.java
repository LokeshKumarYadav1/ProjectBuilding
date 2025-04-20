package com.project.HotelManagement.services;

import com.project.HotelManagement.entity.HotelRecords;

import java.util.List;
@org.springframework.stereotype.Service
public interface RecordService {
   public List<HotelRecords> getRecords();
   public HotelRecords getRecords(String customer);
   public HotelRecords AddRecord(HotelRecords record);
   public HotelRecords updateRecord(HotelRecords record);
   public void deleteRecord(String customer);
}