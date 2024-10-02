/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vartika
 */


import java.util.ArrayList;

public class PersonDirectory {
    
    private ArrayList<Person> persons;

    // Constructor initializes the ArrayList
    public PersonDirectory() {
        this.persons = new ArrayList<Person>();
    }

    // Getter for the persons list
    public ArrayList<Person> getPersons() {
        return persons;
    }

    // Setter for the persons list
    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    // Method to add a new Person and return the created Person object
    public Person addPerson() {
        Person p = new Person();
        persons.add(p);
        return p;
    }

    // Method to delete a Person from the list
    public void deletePerson(Person person) {
        persons.remove(person);
    }

    // Method to search for a Person by their first and last name
    public Person searchPerson(String firstName, String lastName) {
        for (Person p : persons) {
            if (p.getFirstName().equalsIgnoreCase(firstName) && p.getLastName().equalsIgnoreCase(lastName)) {
                return p;
            }
        }
        return null;
    }
}

  
