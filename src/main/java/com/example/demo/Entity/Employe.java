
package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employe {

    @Id
    private int empid;

    @Column
    private String name;

    @Column
    private int password;

    @Column
    private int salary;

    @Column
    private String gender;

    @Column
    private int age;

    public Employe() {
        super();
    }

    public Employe(int empid, String name, int password,
                   int salary, String gender, int age) {

        this.empid = empid;
        this.name = name;
        this.password = password;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
