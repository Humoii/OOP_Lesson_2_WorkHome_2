package org.example;
import org.example.Nurse;
public class Doctor implements Helable, Diagnosisable, Injectionable{
    public NameDoctor NameDoctor;
    public JobTitle JobTitle;
    public Nurse nurse = new Nurse(NameNurse.Виноградова_В_В);

//Constructor

    public Doctor(org.example.NameDoctor nameDoctor, org.example.JobTitle jobTitle) {
        NameDoctor = nameDoctor;
        JobTitle = jobTitle;
    }

//    Methods

    public void NurseInjection(){
        System.out.printf("%s говорит %s сделать укол, медсестра идет делать укол ", NameDoctor, nurse.NameNurse);
    }
    @Override
    public void Heal() {
        System.out.println(NameDoctor + " Вылечил");
    }

    @Override
    public void Diagnosis() {
        System.out.println(NameDoctor + " Поставил диагноз");
    }
    @Override
    public void Injection() {
        System.out.println(NameDoctor + " Сделал укол");
    }

//Gets

    public org.example.NameDoctor getNameDoctor() {
        return NameDoctor;
    }

    public org.example.JobTitle getJobTitle() {
        return JobTitle;
    }


}
