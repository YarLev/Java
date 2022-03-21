package com.java.Exceptions;

public class Account {
    private long id;
    private String name;
    private Integer bill;

    public Account(long id, String name, Integer bill) {
        this.id = id;
        this.name = name;
        this.bill = bill;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBill() {
        return bill;
    }

    public void setBill(Integer bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bill=" + bill +
                '}';
    }
}
