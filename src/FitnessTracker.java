public class FitnessTracker {
    private String name;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String email;
    private String phone;
    private String surname;
    private double weight;
    private String bloodPressure;
    private int stepsPerDay;
    private int age;

    public FitnessTracker(String name, int birthDay, int birthMonth, int birthYear, String email, String phone) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        calculateAge();
    }


        private void calculateAge() {
        age = 2020 - birthYear;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public void printAccountInfo(){
        System.out.printf("Name %s, Surname %s, Date of birth %d.%d.%d,Age %d, Email %s, Phone number %s, Weight %f, Blood pressure %s, Steps per day %d \n", name, surname,birthDay,birthMonth,birthYear,age,email,phone,weight,bloodPressure,stepsPerDay);
    }
}
