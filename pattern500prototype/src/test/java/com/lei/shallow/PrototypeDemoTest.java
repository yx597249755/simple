package com.lei.shallow;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lei.domain.Car;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrototypeDemoTest {
    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void clone1() {


        try {
            PrototypeDemo prototypeDemo = new PrototypeDemo();
            PrototypeDemo prototypeDemo2=prototypeDemo.clone();

            System.out.println("-------------");
            System.out.println("new后的状态"+mapper.writeValueAsString( prototypeDemo ));
            System.out.println("clone后的状态"+mapper.writeValueAsString( prototypeDemo2));

            prototypeDemo.setAd( "ad111" );
            prototypeDemo.setAge( 6666 );
            prototypeDemo.getCar().setName( "BMW1111" );
            System.out.println("修改原始对象");
            System.out.println("new后的状态"+mapper.writeValueAsString( prototypeDemo ));
            System.out.println("clone后的状态"+mapper.writeValueAsString( prototypeDemo2));


            prototypeDemo2.setAd( "ad222" );
            prototypeDemo2.setAge( 9999 );
            prototypeDemo2.getCar().setName( "BMW222" );
            System.out.println("修改克隆对象");
            System.out.println("new后的状态"+mapper.writeValueAsString( prototypeDemo ));
            System.out.println("clone后的状态"+mapper.writeValueAsString( prototypeDemo2));



        } catch (Exception e) {
            e.printStackTrace();
        }





    }
}