package com.huben.c1_3.s11;

import java.util.Date;

public class Emp {
    private int id;
    private String ename;
    private int job_id;
    private int mgr;
    private Date joinDate;
    private double salary;
    private double bonus;
    private int dept_id;

    public Emp(int id, String ename, int job_id, int mgr, Date joinDate, double salary, double bonus, int dept_id) {
        this.id = id;
        this.ename = ename;
        this.job_id = job_id;
        this.mgr = mgr;
        this.joinDate = joinDate;
        this.salary = salary;
        this.bonus = bonus;
        this.dept_id = dept_id;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", job_id=" + job_id +
                ", mgr=" + mgr +
                ", joinDate=" + joinDate +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", dept_id=" + dept_id +
                '}';
    }
}
