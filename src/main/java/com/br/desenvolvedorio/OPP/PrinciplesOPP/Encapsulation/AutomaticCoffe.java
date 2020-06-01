package com.br.desenvolvedorio.OPP.PrinciplesOPP.Encapsulation;

import com.br.desenvolvedorio.OPP.PrinciplesOPP.Polymorphism.CoffeMachine;

public class AutomaticCoffe {

    public void ServeCoffe(){
        CoffeMachine coffeMachine = new CoffeMachine();

        coffeMachine.powerOn();
        coffeMachine.prepareCoffe();
        coffeMachine.powerOff();

    }
}
