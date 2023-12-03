package org.example.PropertyInjection;

public class Doctor implements Staff {

    public String qualification;

    public Doctor(){

    }
    public Doctor(String qualification){
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist() {
        System.out.println("Doctor is assisting");
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }
}
