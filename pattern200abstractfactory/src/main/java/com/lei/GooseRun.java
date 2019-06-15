package com.lei;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GooseRun implements Run {
    @Override
    public String runmethod() {
        log.info( "goose run" );
        return "goose run";
    }
}
