package com.employeewage;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        final int partTime = 1;
        final int fullTime = 2;
        final int wagePerHour = 20;
        int empType = (int) ((Math.random() * 100) % 3);
        int workingHours = 0;
        if (empType == fullTime) {
            System.out.println("Employee is present Full Time ");
            workingHours = 8;
        } else if (empType == partTime) {
            System.out.println("Employee is present Part Time");
            workingHours = 4;
        } else {
            System.out.println("Employee is absent");
        }
        int wage = workingHours * wagePerHour;
        System.out.println("Employee Daily Wage is :" + wage);
    }
}
