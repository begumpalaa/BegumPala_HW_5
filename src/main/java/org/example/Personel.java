package org.example;

public class Personel {
    String name;
    String surname;
    int workday;

    Personel (String name, String surname){
        this.name=name;
        this.surname=surname;

    }
    public String toString() {
        return name + " " + surname;
    }
    public void enterWorkDays(int numberOfWorkDays) {
        this.workday = numberOfWorkDays;
    }

    public Float calculateSalary(float dailySalary){
      Float  salary = workday*dailySalary;
      if (workday>25) {
          int extraWork = workday -25;
          salary += extraWork *1000;
      }
    return salary;
    }
}


