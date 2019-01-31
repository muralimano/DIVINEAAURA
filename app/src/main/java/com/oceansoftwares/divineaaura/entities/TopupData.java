package com.oceansoftwares.divineaaura.entities;

public class TopupData {

    private int id, referenceNo,amount;
    private String name, email, mobile, bank, comments, status;

    public TopupData(int id,String name,  String email, String mobile,int referenceNo, String bank, int amount, String comments, String status) {
        this.id = id;
        this.referenceNo = referenceNo;
        this.amount = amount;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.bank = bank;
        this.comments = comments;
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReferenceNo(int referenceNo) {
        this.referenceNo = referenceNo;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getReferenceNo() {
        return referenceNo;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getBank() {
        return bank;
    }

    public String getComments() {
        return comments;
    }

    public String getStatus() {
        return status;
    }
}
