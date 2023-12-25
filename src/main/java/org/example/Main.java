package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


    Personel accountingPersonel = new Personel("Begüm", "Pala",26);
        float salary = accountingPersonel.calculateSalary(100);
        System.out.println(accountingPersonel + " Salary is : " + salary + "$");

    }
}
