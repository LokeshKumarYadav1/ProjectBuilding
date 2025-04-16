package com.project.HotelManagement.Service;

import com.project.HotelManagement.MyEntity.Records;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ServiceImpl implements Myservice{
    List<Records> list;
    @Autowired
    public ServiceImpl()
    {
        list = new ArrayList<>();
        list.add(new Records(101, "Ram", "Delhi", true, "14 April 2025 (22:30 Hrs)", "15 April 2025 (10:00 Hrs)"));
        list.add(new Records(102, "Shyam", "Pune", true, "14 April 2025 (12:15 Hrs)", "15 April 2025 (10:00 Hrs)"));
    }
    @Override
    public List<Records> GetRecord() {
        return list;
    }

    @Override
    public Records GetRecord(String cust) {
        Records rec = null;
        for (Records temp : list)
        {
            if (temp.getCustomer().equals(cust))
            {
                rec = temp;
                break;
            }
        }
        return rec;
    }
}
