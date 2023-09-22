package org.example;

import java.util.List;
public class VetClinic {

    private List<Animal> patient;

    public VetClinic(List<Animal> patient) {
        this.patient = patient;
    }

    public void addAnimal (Animal animal){
        patient.add(animal);
    }

    public List<Animal> getPatient() {
        return patient;
    }
    public void getFlyable(){
        for (Animal animal : patient) {
            if (animal instanceof Flyable) {
                System.out.println(((Flyable) animal).getFlyNamePet());
            }
        }
    }
    public void getRunnable(){
        for (Animal animal : patient) {
            if (animal instanceof Runnable) {
                System.out.println((((Runnable) animal).getRunNamePet()));
            }
        }
    }
    public void getSwiable(){
        for (Animal animal : patient) {
            if (animal instanceof Swimable) {
                System.out.println(((Swimable) animal).getSwiNamePet());
            }
        }
    }
}
