package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaBeanTest {

    private static Logger log = LogManager.getLogger(TireTest.class);

    @Test
    public void tireBeanTest(){
        TireBean tireBean = new TireBean();
        tireBean.setSize(10);
        tireBean.setWidth(120);
        tireBean.setModel("GF");
        tireBean.setSeries("H");
        tireBean.setManufacturerName("General Motors");

        log.trace("Tire : {}", tireBean.toString());

    }

}