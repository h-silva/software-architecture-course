package com.br.desenvolvedorio;

import com.br.desenvolvedorio.OPP.Employe;
import com.br.desenvolvedorio.OPP.House;
import com.br.desenvolvedorio.OPP.PrinciplesOPP.Polymorphism.CoffeMachine;

import java.time.LocalDate;

public class SofwareAchitectureApplication {

    public static void main(String[] args){

        //Creating new Object
        House myHouse = new House();
        myHouse.floors = 2;
        myHouse.value = 100000;
        myHouse.lenghtM2 = 100;
        myHouse.vacanciesNumber = 2;


        // Creating object with inheritance
        Employe employe = new Employe();
        employe.name = "Heitor Augusto";
        employe.admissionDate = LocalDate.now();
        employe.register = "N119390";
        employe.birthDate = LocalDate.now();

        CoffeMachine coffeMachine = new CoffeMachine();
        coffeMachine.test();
    }
}
