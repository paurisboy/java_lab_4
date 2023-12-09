package org.lab;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * MyReader class provides functionality to read data from a CSV file and populate a list of Human objects.
 */
public class MyReader {

    /**
     * Reads the specified CSV file and returns a list of Human objects parsed from the file.
     *
     * @param csvFileName The name of the CSV file to be read.
     * @return A list of Human objects containing data from the CSV file.
     */
    private static List<Human> readCsvFile(String csvFileName) {
        List<Human> humans = new ArrayList<>();

        try (InputStream inputStream = MyReader.class.getClassLoader().getResourceAsStream(csvFileName);
             InputStreamReader reader = new InputStreamReader(inputStream);
             CSVReader csvReader = new CSVReaderBuilder(reader)
                     .withCSVParser(new com.opencsv.CSVParserBuilder().withSeparator(';').build())
                     .withSkipLines(1)
                     .build()) {

            List<String[]> records = csvReader.readAll();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

            for (String[] record : records) {
                int id = Integer.parseInt(record[0]);
                String name = record[1];
                String gender = record[2];
                LocalDate birthDate = LocalDate.parse(record[3], formatter);
                char divisionTitle = record[4].charAt(0);
                int salary = Integer.parseInt(record[5]);

                Division division = new Division(divisionTitle);
                Human human = new Human(id, name, gender, division, salary, birthDate);

                humans.add(human);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        return humans;
    }
}
