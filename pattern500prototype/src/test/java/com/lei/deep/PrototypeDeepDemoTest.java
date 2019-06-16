package com.lei.deep;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lei.shallow.PrototypeDemo;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrototypeDeepDemoTest {

    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void clone1() {
    }

    @Test
    public void deepClone() {


        try {
            PrototypeDeepDemo PrototypeDeepDemo = new PrototypeDeepDemo();
            PrototypeDeepDemo PrototypeDeepDemo2 = PrototypeDeepDemo.deepClone();

            System.out.println( "-------------" );
            System.out.println( "new后的状态" + mapper.writeValueAsString( PrototypeDeepDemo ) );
            System.out.println( "clone后的状态" + mapper.writeValueAsString( PrototypeDeepDemo2 ) );

            PrototypeDeepDemo.setAd( "ad111" );
            PrototypeDeepDemo.setAge( 6666 );
            PrototypeDeepDemo.getCar().setName( "BMW1111" );
            System.out.println( "修改原始对象" );
            System.out.println( "new后的状态" + mapper.writeValueAsString( PrototypeDeepDemo ) );
            System.out.println( "clone后的状态" + mapper.writeValueAsString( PrototypeDeepDemo2 ) );


            PrototypeDeepDemo2.setAd( "ad222" );
            PrototypeDeepDemo2.setAge( 9999 );
            PrototypeDeepDemo2.getCar().setName( "BMW222" );
            System.out.println( "修改克隆对象" );
            System.out.println( "new后的状态" + mapper.writeValueAsString( PrototypeDeepDemo ) );
            System.out.println( "clone后的状态" + mapper.writeValueAsString( PrototypeDeepDemo2 ) );


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}