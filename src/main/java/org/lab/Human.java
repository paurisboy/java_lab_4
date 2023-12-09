package org.lab;

import java.time.LocalDate;

/**
 * The Human class represents a person with attributes such as ID, name, gender, division, salary, and birth date.
 */
public class Human {

    private int id;
    private String name;
    private String gender;
    private Division division;
    private int salary;
    private LocalDate birthDate;

    /**
     * Constructs a Human object with the specified parameters.
     *
     * @param id         The unique identifier for the Human.
     * @param name       The name of the Human.
     * @param gender     The gender of the Human.
     * @param division   The division to which the Human belongs.
     * @param salary     The salary of the Human.
     * @param birthDate  The birth date of the Human.
     */
    public Human(int id, String name, String gender, Division division, int salary, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.division = division;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    /**
     * Gets the ID of the Human.
     *
     * @return The ID of the Human.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name of the Human.
     *
     * @return The name of the Human.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the gender of the Human.
     *
     * @return The gender of the Human.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Gets the division to which the Human belongs.
     *
     * @return The division of the Human.
     */
    public Division getSubdivision() {
        return division;
    }

    /**
     * Gets the salary of the Human.
     *
     * @return The salary of the Human.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Gets the birth date of the Human.
     *
     * @return The birth date of the Human.
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the name of the Human.
     *
     * @param name The new name for the Human.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the gender of the Human.
     *
     * @param gender The new gender for the Human.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Sets the division to which the Human belongs.
     *
     * @param division The new division for the Human.
     */
    public void setSubdivision(Division division) {
        this.division = division;
    }

    /**
     * Sets the salary of the Human.
     *
     * @param salary The new salary for the Human.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Sets the birth date of the Human.
     *
     * @param birthDate The new birth date for the Human.
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
