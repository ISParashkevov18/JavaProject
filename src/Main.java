import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<Person> people = new ArrayList<>();

        Person person1 = new Person("Plamen", 19, "Burgas");
        Person person2 = new Person("Ivan", 22, "Burgas");
        Person person3 = new Person("Rado", 44, "Burgas");

        people.add(person1);
        people.add(person2);
        people.add(person3);

        for(Person person : people) {
            System.out.println(person.toString());
        }
        */

        /*
        Student student1 = new Student("Plamen", "0443050523", new int[]{6, 6, 2, 6, 6, 6, 6, 6, 6, 6}, 3);
        Student student2 = new Student("Ivan", "0446170546", new int[]{6, 6, 6, 6, 6, 6, 6, 6, 6, 6}, 2);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);

        printStudents(students);
        printStudentsWithoutLowGrades(students);
        */

        Scanner scanner = new Scanner(System.in);

        int choose;


        System.out.println("1. Insert data");
        System.out.println("2. Print data");
        System.out.println("3. Print data with price below 10lv");
        System.out.println("4. Print data with price above 15lv");
        System.out.println("5. Print data with expiration date");
        System.out.print("Choose: "); choose = scanner.nextInt();

        Pharmacy pharmacy1 = new Pharmacy("ashvaganda", 10, 3, LocalDate.now());
        Pharmacy pharmacy2 = new Pharmacy("nurofen", 4, 99, LocalDate.now());
        Pharmacy pharmacy3 = new Pharmacy("stromba", 7, 58, LocalDate.now());

        ArrayList<Pharmacy> pharmacies = new ArrayList<>();

        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);
        pharmacies.add(pharmacy3);

        switch (choose) {
            case 1: insertData(pharmacies);
                break;
            case 2: printAllData(pharmacies);
                break;
            case 3:  printAllMedicinesWithPriceHigherThan15(pharmacies);
                break;
            case 4:  printAllMedicinesWithLowerPriceThan10(pharmacies);
                break;
            case 5:  printPharmaciesWithExpirationDate(pharmacies);
                break;
            default:
                System.out.println("Invalid option!");

        }
    }

    public static void insertData(ArrayList<Pharmacy> pharmacies) {
        Scanner scanner = new Scanner(System.in);
        Pharmacy pharmacy = new Pharmacy();

        String name;
        double price;
        int quantity;

        System.out.println();
        System.out.print("Name: "); name = scanner.nextLine(); pharmacy.name = name;
        System.out.println();
        System.out.print("Price: "); price = scanner.nextDouble(); pharmacy.price = price;
        System.out.println();
        System.out.print("Quantity: "); quantity = scanner.nextInt(); pharmacy.quantity = quantity;
        pharmacy.expirationDate = LocalDate.now();
        pharmacies.add(pharmacy);
    }

    public static void printAllData(ArrayList<Pharmacy> pharmacies) {
        for (Pharmacy p : pharmacies) {
            System.out.println(p.toString());
        }
    }

    public static void printStudents(ArrayList<Student> students) {

        ArrayList<Student> newStudents = new ArrayList<>();

        for (Student s : students) {
            if(s.course > 2) {
                newStudents.add(s);
            }
        }

        for (Student s1 : newStudents) {
            System.out.println(s1.name);
        }
    }

    public static void printAllMedicinesWithPriceHigherThan15(ArrayList<Pharmacy> pharmacies) {

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();

        for (Pharmacy p : pharmacies) {
            if(p.price > 15) {
                newPharmacies.add(p);
            }
        }

        for (Pharmacy p : newPharmacies) {
            System.out.println(p.name);
        }
    }

    public static void printAllMedicinesWithLowerPriceThan10(ArrayList<Pharmacy> pharmacies){
        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();
        for(Pharmacy p : pharmacies){
            if(p.price < 10){
                newPharmacies.add(p);
            }
        }

        for (Pharmacy p : newPharmacies) {
            System.out.println(p.toString());
        }
    }

    public static void printPharmaciesWithExpirationDate(ArrayList<Pharmacy> pharmacies){

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();

        LocalDate date = LocalDate.of(2033, 12, 12);

        for(Pharmacy p : pharmacies){
            if(p.expirationDate.equals(date)){
                newPharmacies.add(p);
            }
        }

        for (Pharmacy p : newPharmacies) {
            System.out.println(p.toString());
        }
    }

    public static void printStudentsWithoutLowGrades(ArrayList<Student> students) {

        ArrayList<Student> newStudents = new ArrayList<>();
        boolean isTrue = false;

        for (Student s : students) {
            isTrue = false;
            for(int i = 0; i < s.grades.length; i++) {
                if(s.grades[i] < 3) {
                    isTrue = true;
                    break;
                }
            }

            if(isTrue == false) {
                newStudents.add(s);
            }
        }

        System.out.println("siuuuuuuuu");

        for (Student s1 : newStudents) {
            System.out.println(s1.toString());
        }
    }
}