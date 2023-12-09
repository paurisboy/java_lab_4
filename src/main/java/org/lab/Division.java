package org.lab;

import java.util.Random;

/**
 * The Division class represents a division or subgroup with attributes such as ID and title.
 */
public class Division {

    private int id;
    private char title;

    /**
     * Constructs a Division object with the specified title and generates a unique ID.
     *
     * @param title The title of the Division.
     */
    public Division(char title) {
        this.id = generateId();
        this.title = title;
    }

    /**
     * Gets the ID of the Division.
     *
     * @return The ID of the Division.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the title of the Division.
     *
     * @return The title of the Division.
     */
    public char getTitle() {
        return title;
    }

    /**
     * Sets the title of the Division.
     *
     * @param title The new title for the Division.
     */
    public void setTitle(char title) {
        this.title = title;
    }

    /**
     * Generates a unique ID for the Division.
     *
     * @return A randomly generated unique ID for the Division.
     */
    private int generateId() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}
