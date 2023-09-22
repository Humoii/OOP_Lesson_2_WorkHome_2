package org.example;

public abstract class Animal{

    public String NameOwner;
    public String NamePet;
    public Double AgePet;
    public Double WeightPet;
    public Double Speed;
    private String TYPE = this.getClass().getSimpleName();

//    Constructor
    public Animal(String nameOwner, String namePet, Double agePet, Double weightPet, Double speed) {
        NameOwner = nameOwner;
        NamePet = namePet;
        AgePet = agePet;
        WeightPet = weightPet;
        Speed = speed;
    }

//    Gets

    public String getNameOwner() {
        return NameOwner;
    }

    public String getNamePet() {
        return NamePet;
    }

    public Double getAgePet() {
        return AgePet;
    }

    public Double getWeightPet() {
        return WeightPet;
    }

    public Double getSpeed() {
        return Speed;
    }

    public String getTYPE() {
        return TYPE;
    }
}
