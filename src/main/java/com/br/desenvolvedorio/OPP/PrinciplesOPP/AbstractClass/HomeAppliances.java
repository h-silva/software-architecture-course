package com.br.desenvolvedorio.OPP.PrinciplesOPP.AbstractClass;

public abstract class HomeAppliances {

    private String name;
    private int voltage;

    protected HomeAppliances(String name, int voltage){
        this.name = name;
        this.voltage = voltage;
    }

    public abstract void powerOn();

    public abstract  void powerOff();

    public void test(){
        System.out.println("Testing equipment");
    }
}
