package com.project.HotelManagement.service;

import com.project.HotelManagement.entity.HotelRecords;
import com.project.HotelManagement.dao.RecordDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements Myservice{

    @Autowired
    private RecordDAO recordDao;

   // List<Records> list;
    //@Autowired
    public ServiceImpl()
    {
//        list = new ArrayList<>();
//        list.add(new Records(101, "Ram", "Delhi", true, "14 April 2025 (22:30 Hrs)", "15 April 2025 (10:00 Hrs)"));
//        list.add(new Records(102, "Shyam", "Pune", true, "14 April 2025 (12:15 Hrs)", "15 April 2025 (10:00 Hrs)"));
    }
    @Override
    public List<HotelRecords> getRecords() {
        //return list;

        return recordDao.findAll();
    }

    @Override
    public HotelRecords getRecords(String customerName) {
//        Records rec = null;
//        for (Records temp : list)
//        {
//            if (temp.getCustomer().equals(customerName))
//            {
//                rec = temp;
//                break;
//            }
//        }
//        return rec;

        return recordDao.getOne(customerName);
    }

    @Override
    public HotelRecords AddRecord(HotelRecords record) {
//        list.add(record);
//        return record;
        recordDao.save(record);
        return record;
    }

    @Override
    public HotelRecords UpdateRecord(HotelRecords record) {
//        list.forEach(e -> {
//            if (e.getCustomer().equals(record.getCustomer())){
//                e.setChequeOut(record.getChequeOut());
//                e.setRoomNo(record.getRoomNo());
//            }
//        });
//        return record;
        recordDao.save(record);
        return record;
    }

    @Override
    public void DeleteRecord(String customer) {
       //list = this.list.stream().filter(e-> Boolean.parseBoolean(e.getCustomer())).collect(Collectors.toList());
       HotelRecords entity = recordDao.getOne(customer);
       recordDao.delete(entity);
    }
}
