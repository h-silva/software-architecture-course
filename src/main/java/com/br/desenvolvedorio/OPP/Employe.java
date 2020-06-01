package com.br.desenvolvedorio.OPP;

import java.time.LocalDate;

public class Employe extends People {

    public LocalDate admissionDate;
    public String register;

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }
}
