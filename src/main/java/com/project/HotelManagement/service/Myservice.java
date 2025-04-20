package com.project.HotelManagement.service;

import com.project.HotelManagement.entity.HotelRecords;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Myservice {
   public List<HotelRecords> getRecords();
   public HotelRecords getRecords(String customer);
   public HotelRecords AddRecord(HotelRecords record);
   public HotelRecords UpdateRecord(HotelRecords record);
   public void DeleteRecord(String customer);
}