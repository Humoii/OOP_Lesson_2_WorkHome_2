package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Создаем List Animal
        VetClinic clinic = new VetClinic(new ArrayList<>());
        clinic.addAnimal(new Cat("Alex", "Barsic", 3.5, 5.0, 15.0));
        clinic.addAnimal(new Parrot("Andrey","Kesha", 2.0, 0.3, 10.5));
        clinic.addAnimal(new Fish("Valeria", "DoDo", 0.6, 0.4, 7.8));
        clinic.addAnimal(new Parrot("Viktor","German", 3.0, 0.7, 11.0));
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Создаем отдельно от List каких-то животных
        Cat cat = new Cat("Dmitriy", "Keks", 5.0, 4.5, 16.0);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Создаем докторов и медсестер
        Doctor doctor = new Doctor(NameDoctor.Иванов_И_И, JobTitle.Терапевт);
        Doctor doctor1 = new Doctor(NameDoctor.Петров_А_В, JobTitle.Хирург);
        Nurse nurse = new Nurse(NameNurse.Виноградова_В_В);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Выполняем действия
        clinic.getFlyable();
        clinic.getRunnable();
        clinic.getSwiable();

        for (Animal animal : clinic.getPatient()){
            System.out.println(animal.NamePet);
            doctor.Diagnosis();
            doctor1.Heal();
            nurse.Injection();
            if (animal instanceof Flyable){
                System.out.println(((Flyable) animal).getFlySpeed());
                ((Flyable) animal).Eat();
            }
            if (animal instanceof Runnable){
                System.out.println(((Runnable)animal).getRunSpeed());
            }
            if (animal instanceof Swimable){
                System.out.println(((Swimable)animal).getSwimSpeed());
            }
            if (animal instanceof  Flyable){
                System.out.println(animal.NamePet + " Летающий");
            }

        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Взаимодействие с медсестрой
        doctor1.NurseInjection();
        System.out.println(cat.NamePet);
        nurse.Injection();
    }
}