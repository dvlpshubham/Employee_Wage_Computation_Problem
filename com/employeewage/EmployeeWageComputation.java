package com.employeewage;

public class EmployeeWageComputation {
    public static void main(String[] args) {

        final int partTime = 1;
        final int fullTime = 2;
        final int wagePerHour = 20;
        final int workingDay = 20;

        int monthWage = 0;
        for (int day = 1; day <= workingDay; day++) {
            int empType = (int) ((Math.random() * 100) % 3);
            int workingHours = 0;
            switch (empType) {
                case fullTime:
                    System.out.println("Employee is present Full Time ");
                    workingHours = 8;
                    break;
                case partTime:
                    System.out.println("Employee is present Part Time");
                    workingHours = 4;
                    break;
                default:
                    System.out.println("Employee is absent");
            }
            int wage = workingHours * wagePerHour;
            System.out.println("Employee Daily Wage is :" + wage);
            monthWage += wage;
        }
        System.out.println("Total wage for a month is :" + monthWage);
    }
}
