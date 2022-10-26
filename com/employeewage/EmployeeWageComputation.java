package com.employeewage;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        final int fullTime = 1;
        final int wagePerHour = 20;
        int empType = (int) ((Math.random() * 100) % 2);
        int workingHours = 0;
        if (empType == fullTime) {
            System.out.println("Employee is present ");
            workingHours = 8;
        } else {
            System.out.println("Employee is absent");
        }
        int wage = workingHours * wagePerHour;
        System.out.println("Employee Daily Wage is :" + wage);
    }
}
