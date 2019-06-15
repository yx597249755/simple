package com.lei;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CatCry implements Cry {
    @Override
    public String crymethod() {
        log.info( "cat cry" );
        return "cat cry";
    }
}
