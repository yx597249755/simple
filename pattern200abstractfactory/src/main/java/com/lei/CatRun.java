package com.lei;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CatRun implements Run {
    @Override
    public String runmethod() {
        log.info( "cat run" );
        return "cat run";
    }
}
