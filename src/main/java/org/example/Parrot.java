package org.example;

public class Parrot extends Animal implements Flyable{
//    Constructors
    public Parrot(String nameOwner, String namePet, Double agePet, Double weightPet, Double speed) {
        super(nameOwner, namePet, agePet, weightPet, speed);
    }
//    Methods
    @Override
    public double getFlySpeed(){
        return getSpeed();
    }
    @Override
    public String getFlyNamePet(){
        return NamePet;
    }

    @Override
    public void Eat() {
        System.out.println(NamePet + " Кушает");
    }
}
