package com.lei;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DogRun implements Run {
    @Override
    public String runmethod() {
        log.info( "dog run" );
        return "dog run";
    }
}
