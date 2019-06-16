package com.lei;

import java.security.PrivateKey;

public abstract class Bridge {

     public Student student;

     public abstract void displayStudy();

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
