package com.fidexio.utilities;

import io.cucumber.java.After;


public class Hooks {

    @After
    public void teardownScenario(){

        Driver.closeDriver();

    }
}
