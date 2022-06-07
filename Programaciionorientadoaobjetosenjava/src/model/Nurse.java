package model;

public abstract class Nurse extends user{
   private String speciality;

   public Nurse (String name, String email){
       super(name, email);

   }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
