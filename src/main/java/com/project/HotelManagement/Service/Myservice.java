package com.project.HotelManagement.Service;

import com.project.HotelManagement.MyEntity.HotelRecords;
import com.project.HotelManagement.MyEntity.HotelRecords;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Myservice {
   public List<HotelRecords> GetRecord();
   public HotelRecords GetRecord(String customer);
   public HotelRecords AddRecord(HotelRecords record);
   public HotelRecords UpdateRecord(HotelRecords record);
   public void DeleteRecord(String customer);
}