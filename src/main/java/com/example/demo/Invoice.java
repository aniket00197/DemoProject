package com.example.demo;

import java.util.Date;

public class Invoice {
    private String title;
    private Date date;
    private  double total;

    public Invoice(String my_invoice, Date date, double v) {
        this.title = title;
        this.date = this.date;
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", total=" + total +
                '}';
    }
}
