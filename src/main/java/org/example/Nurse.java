package org.example;

public class Nurse implements Injectionable{
    public NameNurse NameNurse;

// Constructors
    public Nurse(org.example.NameNurse nameNurse) {
        NameNurse = nameNurse;
    }
// Gets

    public org.example.NameNurse getNameNurse() {
        return NameNurse;
    }

    //    Methods
    @Override
    public void Injection() {
        System.out.println(NameNurse + " Сделала укол");
    }

//    @Override
//    public void DoctorNurse() {
//        System.out.println(getNameNurse() + " Идет делать укол");
//    }

}
