package com.employeewage;

public class EmployeeWageComputation {
    public static void main(String[] args) {

        final int fullTime = 1;
        int empType = (int) ((Math.random() * 100) % 2);

        if (empType == fullTime)
            System.out.println("Employee is present ");

        else
            System.out.println("Employee is absent");
    }

}
