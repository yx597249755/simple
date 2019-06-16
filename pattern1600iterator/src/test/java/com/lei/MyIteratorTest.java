package com.lei;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyIteratorTest {

    @Test
    public void testone(){
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}