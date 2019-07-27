package com.mgchoo.security2.admin.entity;

public class Admin {
    Integer idx;
    String  subject;
    String  content;
    String  sent_date;
    String  received_date;
    String  read_yn;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSent_date() {
        return sent_date;
    }

    public void setSent_date(String sent_date) {
        this.sent_date = sent_date;
    }

    public String getReceived_date() {
        return received_date;
    }

    public void setReceived_date(String received_date) {
        this.received_date = received_date;
    }

    public String getRead_yn() {
        return read_yn;
    }

    public void setRead_yn(String read_yn) {
        this.read_yn = read_yn;
    }
}
