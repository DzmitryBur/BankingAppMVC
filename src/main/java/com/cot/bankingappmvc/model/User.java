package com.cot.bankingappmvc.model;


import org.springframework.stereotype.Component;

@Component
public class User {

    long id;
    String Name;
    String Industry;
    String Residency;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Industry='" + Industry + '\'' +
                ", Residency='" + Residency + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIndustry() {
        return Industry;
    }

    public void setIndustry(String industry) {
        Industry = industry;
    }

    public String getResidency() {
        return Residency;
    }

    public void setResidency(String residency) {
        Residency = residency;
    }
}

