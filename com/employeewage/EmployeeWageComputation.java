package com.employeewage;

public class EmployeeWageComputation {
    public static void main(String[] args) {

        final int partTime = 1;
        final int fullTime = 2;
        final int wagePerHour = 20;
        final int maxWorkingDay = 20;
        final int maxWorkingHours = 100;

        int monthWage = 0;
        int workingHours = 0;
        int totalWorkingHours = 0;
        int day;
        for (day = 1, totalWorkingHours = 0; day <= maxWorkingDay
                && totalWorkingHours < maxWorkingHours; day++, totalWorkingHours += workingHours) {
            int empType = (int) ((Math.random() * 100) % 3);

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
            System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHours, wage, totalWorkingHours + workingHours);
        }
        System.out.println("Total wage for a month is :" + monthWage);
    }
}
