package org.example.PropertyInjection;

public class Nurse implements Staff{

    public String education;

    public Nurse(){

    }
    public Nurse(String education) {
        this.education = education;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "education='" + education + '\'' +
                '}';
    }

    public void assist(){
        System.out.println("Nurse is taking care of patients");
    }
}
