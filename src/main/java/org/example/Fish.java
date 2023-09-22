package org.example;

public class Fish extends Animal implements Swimable{
//    Constructors
    public Fish(String nameOwner, String namePet, Double agePet, Double weightPet, Double speed) {
        super(nameOwner, namePet, agePet, weightPet, speed);
    }
//    Methods
    @Override
    public double getSwimSpeed() {
        return getSpeed();
    }
    @Override
    public String getSwiNamePet(){
        return NamePet;
    }

    @Override
    public void Eat() {
        System.out.println(NamePet + " Кушает");
    }
}
