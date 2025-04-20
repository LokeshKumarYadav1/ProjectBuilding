package com.project.HotelManagement.services;

import com.project.HotelManagement.entity.HotelRecords;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface service {
   public List<HotelRecords> getRecords();
   public HotelRecords getRecords(String customer);
   public HotelRecords AddRecord(HotelRecords record);
   public HotelRecords UpdateRecord(HotelRecords record);
   public void DeleteRecord(String customer);
}