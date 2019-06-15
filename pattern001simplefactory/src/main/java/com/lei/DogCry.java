package com.lei;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DogCry implements Cry {
    @Override
    public String crymethod() {

        log.info( "dog cry" );
        return "dog cry";
    }
}
