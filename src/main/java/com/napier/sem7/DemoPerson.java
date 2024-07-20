package com.napier.sem7;

public class DemoPerson {
    public static void main(String[] args) {
        // Create an array to store 3 Person objects
        Person[] people = new Person[3];

        // Initialize the array with Person objects
        people[0] = new Person("Alice", "456 Elm St", 28);
        people[1] = new Person("Bob", "789 Oak St", 34);
        people[2] = new Person("Charlie", "101 Pine St", 22);

        // Print out the details of each person to verify they are stored correctly
        for (Person person : people) {
            person.printDetails();
        }
    }
}

