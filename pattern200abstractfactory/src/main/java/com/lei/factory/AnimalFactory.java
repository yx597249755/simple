package com.lei.factory;

import com.lei.Cry;
import com.lei.Run;

public interface AnimalFactory {
    Cry createCry();
    Run createRun();

}
