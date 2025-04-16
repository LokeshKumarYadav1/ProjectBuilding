package com.project.HotelManagement.MyEntity;

public class Records {
    int RoomNo;
    String Customer;
    String Address;
    Boolean Equipped;
    String ChequeIn;
    String ChequeOut;

    public Records(int roomNo, String customer, String address, Boolean equipped, String chequeIn, String chequeOut) {
        RoomNo = roomNo;
        Customer = customer;
        Address = address;
        Equipped = equipped;
        ChequeIn = chequeIn;
        ChequeOut = chequeOut;
    }

    public int getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(int roomNo) {
        RoomNo = roomNo;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Boolean getEquipped() {
        return Equipped;
    }

    public void setEquipped(Boolean equipped) {
        Equipped = equipped;
    }

    public String getChequeIn() {
        return ChequeIn;
    }

    public void setChequeIn(String chequeIn) {
        ChequeIn = chequeIn;
    }

    public String getChequeOut() {
        return ChequeOut;
    }

    public void setChequeOut(String chequeOut) {
        ChequeOut = chequeOut;
    }

    @Override
    public String toString() {
        return "Records{" +
                "RoomNo=" + RoomNo +
                ", Customer='" + Customer + '\'' +
                ", Address='" + Address + '\'' +
                ", Equipped=" + Equipped +
                ", ChequeIn='" + ChequeIn + '\'' +
                ", ChequeOut='" + ChequeOut + '\'' +
                '}';
    }
}
