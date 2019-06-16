package com.lei.one;

public interface Subject {
     void accept(Visitor visitor);
     String getSubject();

}
