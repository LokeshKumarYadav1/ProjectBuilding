package com.project.HotelManagement.dao;

import com.project.HotelManagement.entity.HotelRecords;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordDAO extends JpaRepository<HotelRecords, String> {
}
