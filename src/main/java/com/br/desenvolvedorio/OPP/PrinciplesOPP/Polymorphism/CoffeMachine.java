package com.br.desenvolvedorio.OPP.PrinciplesOPP.Polymorphism;

import com.br.desenvolvedorio.OPP.PrinciplesOPP.AbstractClass.HomeAppliances;

public class CoffeMachine extends HomeAppliances {

    public CoffeMachine(String name, int voltage) {
        super(name, voltage);
    }

    public CoffeMachine(){
        super("Standard", 220);
    }

    private void heatWater(){

    }

    private void grindCoffe(){

    }

    public void prepareCoffe(){
        test();
        powerOn();
        grindCoffe();
        heatWater();
        powerOff();
    }

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }
}
