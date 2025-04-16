package com.project.HotelManagement.Service;

import com.project.HotelManagement.MyEntity.Records;

import java.util.List;

public interface Myservice {
   public List<Records> GetRecord();
   public Records GetRecord(String customer);
}
