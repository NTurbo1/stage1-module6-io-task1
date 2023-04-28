package com.epam.mjc.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {
        String name = null;
        String age = null;
        String email = null;
        String phone = null;
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file));) {
            name = reader.readLine().split(": ")[1];
            age = reader.readLine().split(": ")[1];
            email = reader.readLine().split(": ")[1];
            phone = reader.readLine().split(": ")[1];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return new Profile(name, Integer.parseInt(age), email, Long.parseLong(phone));
    }
}
