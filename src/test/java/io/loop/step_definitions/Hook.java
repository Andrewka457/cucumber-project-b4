package io.loop.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.loop.test.utilities.Driver;


public class Hook {

    @Before
    public void setup() {
        Driver.getDriver();
    }

    @After
    public void teardown() {
        Driver.closeDriver();
    }

}
