package org.example;

public class Cat extends Animal implements Runnable {

//    Constructors
public Cat(String nameOwner, String namePet, Double agePet, Double weightPet, Double speed) {
    super(nameOwner, namePet, agePet, weightPet, speed);
}

//    Methods
    @Override
    public double getRunSpeed() {
        return getSpeed();
    }
    @Override
    public String getRunNamePet(){
        return NamePet;
    }
    @Override
    public void Eat() {
        System.out.println(NamePet + " Кушает");
    }
}
