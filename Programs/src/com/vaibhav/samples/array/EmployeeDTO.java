package com.vaibhav.samples.array;

public class EmployeeDTO {
    String name;
    int id;
    String phone;

    public EmployeeDTO(String name, int id, String phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phone='" + phone + '\'' +
                '}';
    }
}
