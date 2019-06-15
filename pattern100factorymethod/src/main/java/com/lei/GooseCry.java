package com.lei;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GooseCry implements Cry {

    @Override
    public String crymethod() {
        log.info( "goose cry" );
        return "goose cry";
    }
}
