package com.engeto.hotel;

import java.time.LocalDate;
import java.util.List;

public class Guest {

    public String name;
    public String surname;
    public LocalDate born;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    @Override
    public String toString() {
        return  name + ' ' + surname;
    }

    public Guest(String name, String surname, LocalDate born) {
        this.name = name;
        this.surname = surname;
        this.born = born;


    }
}
