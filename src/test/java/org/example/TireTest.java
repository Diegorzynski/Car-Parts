package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.Test;

public class TireTest {
    private static Logger log = LogManager.getLogger(TireTest.class);

    @Test
    public void tireTest(){
        Tire tire = new Tire("Ford","Astra","GH", 95,10);
        Tire tire1 = new Tire("Volkswagen","B15","J",200,15);
        log.trace("Tires {} {}", tire.toString(), tire1.toString());
    }

    @Test
    public void exhaustTest(){
        Exhaust exhaust = new Exhaust("VolksWagen","GTS35","A",true);
        Exhaust exhaust1 = new Exhaust("Chevrolet","SW","C",false);
        log.trace("Exhausts: {} {}", exhaust.toString(), exhaust1.toString());
    }



}