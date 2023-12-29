package com.arrays;

import java.util.Scanner;

public class AverageSubjects {
    /*In this project you'll type how many students you want to register and their grades in 3 different subject, after that you'll be able to choose between 4 options
     to know the different averages*/
    public static void main(String[] args) {

        System.out.println("~~ Welcome to the register of students and their school grades ~~\n");

        Scanner input = new Scanner(System.in);

        System.out.println("How many students want to register?");

        int studentsNumber = input.nextInt();

        //Array of students
        String[] students = new String[studentsNumber];
        //Arrays of his school grades
        double[] math = new double[studentsNumber];
        double[] programming = new double[studentsNumber];
        double[] networks = new double[studentsNumber];

        //fill students array
        for (int i = 0; i < studentsNumber; i++) {
            System.out.println("Student No. " + (i + 1));
            students[i] = input.next();
        }

        System.out.println("\n~~ School grades of Math ~~");
        for (int i = 0; i < studentsNumber; i++) {
            System.out.println("School grades of " + students[i] + ":");
            math[i] = input.nextDouble();
        }

        System.out.println("\n~~ School grades of Programming ~~");
        for (int i = 0; i < studentsNumber; i++) {
            System.out.println("School grades of " + students[i] + ":");
            programming[i] = input.nextDouble();
        }

        System.out.println("\n~~ School grades of Networks ~~");
        for (int i = 0; i < studentsNumber; i++) {
            System.out.println("School grades of " + students[i] + ":");
            networks[i] = input.nextDouble();
        }

        String option;
        double average;
        double averageMat = 0;
        double averagePg = 0;
        double averageNw = 0;
        double averageAllMat = 0;
        double averageAllPg = 0;
        double averageAllNw = 0;
        int j = -1;
        String studentName;
        String subject;


        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1- Know the average of a student");
            System.out.println("2- know the group average in a subject");
            System.out.println("3- Know the general group average");
            System.out.println("4- Exit");
            System.out.println("\nChoose an option");
            option = input.next();

            switch (option) {
                case "1":

                    System.out.println("Type the student name");
                    studentName = input.next();

                    for (int i = 0; i < studentsNumber; i++) {
                        if (studentName.equalsIgnoreCase(students[i])) {
                            j = i;
                        }
                    }

                    if (j >= 0) {
                        average = (math[j] + programming[j] + networks[j]) / 3;
                        System.out.println("Este es tu promedio: " + average);
                    } else {
                        System.out.println("Student not found");
                    }

                    break;

                case "2":
                    while (true) {
                        System.out.println("Type the subject name");
                        subject = input.next();

                        if (subject.equalsIgnoreCase("math")) {
                            for (int i = 0; i < math.length; i++) {
                                averageMat += math[i];
                            }
                            averageMat = averageMat / math.length;
                            System.out.println("The average of the Math subject is: " + averageMat);
                            break;
                        } else if (subject.equalsIgnoreCase("programming")) {
                            for (int i = 0; i < programming.length; i++) {
                                averagePg += programming[i];
                            }
                            averagePg = averagePg / math.length;
                            System.out.println("The average of the Programming subject is: " + averagePg);
                            break;
                        } else if (subject.equalsIgnoreCase("networks")) {
                            for (int i = 0; i < networks.length; i++) {
                                averageNw += networks[i];
                            }
                            averageNw = averageNw / networks.length;
                            System.out.println("The average of the Networks subject is: " + averageNw);
                            break;
                        }
                        System.out.println("Subject not found");
                    }

                    break;
                case "3":
                    for (int i = 0; i < math.length; i++) {
                        averageAllMat += math[i];
                        averageAllPg += programming[i];
                        averageAllNw += networks[i];
                    }
                    averageAllMat = averageAllMat / 3;
                    averageAllPg = averageAllPg / 3;
                    averageAllNw = averageAllNw / 3;

                    double averageSubjects = (averageAllMat + averageAllPg + averageAllNw) / 3;

                    System.out.println("The average of all subjects is: " + averageSubjects);

                    break;

                case "4":
                    System.out.println("See you");
                    System.exit(0);
                default:
                    System.out.println("Type a correct option");
            }
        }

    }
}
