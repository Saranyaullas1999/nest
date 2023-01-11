package com.nest.menudriven;

public class Fooditems {

    Integer Tea;
    Integer Coffee;
    Integer Idil;
    Integer Dosa;

    public Fooditems(Integer tea, Integer coffee, Integer idil, Integer dosa) {
        Tea = tea;
        Coffee = coffee;
        Idil = idil;
        Dosa = dosa;
    }

    public Integer getTea() {
        return Tea;
    }

    public void setTea(Integer tea) {
        Tea = tea;
    }

    public Integer getCoffee() {
        return Coffee;
    }

    public void setCoffee(Integer coffee) {
        Coffee = coffee;
    }

    public Integer getIdil() {
        return Idil;
    }

    public void setIdil(Integer idil) {
        Idil = idil;
    }

    public Integer getDosa() {
        return Dosa;
    }

    public void setDosa(Integer dosa) {
        Dosa = dosa;
    }
}
