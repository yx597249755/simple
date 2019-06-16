package com.lei.director;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lei.product.Cat;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatDirectorTest {

    CatDirector catDirector = new CatDirector();
    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void getBlackCat() {


        Cat cat = catDirector.getBlackCat();

        try {
            System.out.println(mapper.writeValueAsString( cat ));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void getWhiteCat() {
        Cat cat = catDirector.getWhiteCat();

        try {
            System.out.println(mapper.writeValueAsString( cat ));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getFlowerCat() {
        Cat cat = catDirector.getFlowerCat();

        try {
            System.out.println(mapper.writeValueAsString( cat ));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}